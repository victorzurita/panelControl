import { Subject } from 'rxjs/Subject';

/**
 * Class to share message type.
 */
export class SharedMessageTypeService {
  private subject = new Subject<string>();
  private navSelection = new Subject<string>();
  private preview = new Subject<object>();
  private totalCounterMessages = new Subject<number>();
  private refreshMessage = new Subject<object>();
  private refreshView = new Subject<object>();
  public messageType$ = this.subject.asObservable();
  public messageClasification$ = this.navSelection.asObservable();
  public totalCounterMessages$ = this.totalCounterMessages.asObservable();
  public messagePreview$ = this.preview.asObservable();
  public refreshMessage$ = this.refreshMessage.asObservable();
  public refreshView$ = this.refreshView.asObservable();

  /**
   * Dispatchs a event with message type
   * @param typeMessage A MessageType
   */
  publishText(messageType: string) {
    this.subject.next(messageType);
  }

  /**
   * Dispatchs a event with message clasification
   * @param messageClasification A MessageClasification
   */
  publishClasification(messageClasification: string) {
    this.navSelection.next(messageClasification);
  }

  /**
   * Dispatchs a event with preview Message
   * @param showPreview A preview message
   */
  publishPreview(objectPreview: object) {
    this.preview.next(objectPreview);
  }

  /**
   * Dispatchs a event with total counter of messages
   * @param totalCounter An counter of total messages
   */
  publishTotalCounterMessages(totalCounter: number) {
    this.totalCounterMessages.next(totalCounter);
  }

  /**
   * Dispatchs a event with an object.
   * @param objectPreview An Object that contains messageId and message clasification.
   * @example objectPreview = {
   *                            messageId: 88,
   *                            messageType: previewComponent
   *                          }
   */
  publishRefreshContentPreview(objectPreview: object) {
    this.refreshMessage.next(objectPreview);
  }

  /**
   * Dispatchs a event with object message preview saved
   * @param objectPreview An Object that contains complete message object.
   */
  publishRefreshView(objectPreview: object) {
      this.refreshView.next(objectPreview);
  }
}
