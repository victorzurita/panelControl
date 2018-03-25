import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions, URLSearchParams, ResponseContentType } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { AppConfig } from '../config/app.config';

// Observable operators
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';

/**
 * Class to make CRUD with services
 */
@Injectable()
export class RestCommonService {

    private headers: Headers;
    private options: RequestOptions;

    /**
     * Create an instance of RestCommonService.
     * @param http An class to create requests to server.
     */
    constructor(private http: Http) {}

    /**
     * Gets an object that contain headers needed to make a request to server.
     */
    optionsHeader () {
        return new RequestOptions({
            headers: new Headers({
                'Content-Type': 'application/json'
            }),
            responseType: ResponseContentType.Json
        });
    }

    /**
     * Create
     * @param url string param to add to baseURL, i.e '/messages/count', baseURL has 'http://localhost:8500'
     * @param payload string body in json format to send and consume service
     */
    post(url: string, payload: any): Observable<any> {
        console.log(AppConfig.BASE_API_URL);
        const options = this.optionsHeader();
        const body = JSON.stringify(payload);
        return this.http
            .post(`${AppConfig.BASE_API_URL}${url}`, body, options)
            .map(res => res.json())
            .catch(this.handleError);
    }

    /**
     * Read
     * @param url string param to add to baseURL, i.e '/jobs/group/12?page=0&size=100', baseURL has 'http://localhost:8500'
     * @param args Argumentos that will be added on Header
     */
    get(url: string, ...args): Observable<any> {
        const options = this.optionsHeader();
        args.forEach(element => { Object.assign(options, element); });
        return this.http
            .get(`${AppConfig.BASE_API_URL}${url}`, options)
            .map(res => res.json())
            .catch(this.handleError);
    }

    /**
    * Delete
    * @param url string param to add to baseURL, i.e '/jobs/delete/1', baseURL has 'http://localhost:8500'
    */
    delete(url: string): Observable<any> {
        const options = this.optionsHeader();
        return this.http
            .delete(`${AppConfig.BASE_API_URL}${url}`, options)
            .map(res => res.json())
            .catch(this.handleError);
    }

    /**
    * Update
    * @param url string param to add to baseURL, i.e '/campaign/9', baseURL has 'http://localhost:8500'
    * @param param string body in json format to send and consume service
    */
    put(url: string, param: any): Observable<any> {
        const options = this.optionsHeader();
        const body = JSON.stringify(param);
        return this.http
            .put(`${AppConfig.BASE_API_URL}${url}`, body, this.options)
            .map(res => res.json())
            .catch(this.handleError);

    }

    /**
     * This method will manage the errors if it can't consume or some problem ocurs
     */
    private handleError(error: any) {
        const errMsg = (error.message) ? error.message :
        error.status ? `${error.status} - ${error.statusText}` : 'Server error';
        console.error(errMsg);
        return Observable.throw(errMsg);
    }
}
