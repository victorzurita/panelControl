import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms'
import { HttpClient } from '@angular/common/http';
import { RestCommonService } from './../../services/rest-common.service';
import { Router } from '@angular/router';

declare var $: any;

@Component({
    moduleId: module.id,
    selector: 'login-cmp',
    templateUrl: './login.component.html'
})

export class LoginComponent implements OnInit {
    test: Date = new Date();
    nickName: string;
    password: string;
    constructor(private router: Router, private service: RestCommonService) { }
    checkFullPageBackgroundImage() {
        var $page = $('.full-page');
        var image_src = $page.data('image');

        if (image_src !== undefined) {
            var image_container = '<div class="full-page-background" style="background-image: url(' + image_src + ') "/>'
            $page.append(image_container);
        }
    };
    ngOnInit() {
        this.checkFullPageBackgroundImage();

        setTimeout(function () {
            // after 1000 ms we add the class animated to the login/register card
            $('.card').removeClass('card-hidden');
        }, 700)
    }
    auth() {
        const dataAuthentication = {
            nickName: this.nickName,
            password: this.password
        };

        this.service.post('/auth', dataAuthentication)
            .subscribe(
            response => {
                if (response.status) {
                    this.router.navigate(['/dashboard'])
                } else {
                    $.notify({
                        icon: "notifications",
                        message: "nickName o password son incorrectos!"

                    }, {
                            type: 'danger',
                            timer: 1000,
                            placement: {
                                from: 'top',
                                align: 'center'
                            }
                        });
                }
            },
            err => {
                console.log(err);
            });
    }
}
