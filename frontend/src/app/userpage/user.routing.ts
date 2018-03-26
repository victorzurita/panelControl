import { Routes } from '@angular/router';

import { UserComponent } from './user.component';
import { ListUsersComponent } from './list-users/list-users.component'

export const UserRoutes: Routes = [
    {

        path: '',
        children: [
            {
                path: 'pages/user',
                component: UserComponent
            },
            {
                path: 'list/users',
                component: ListUsersComponent
            }
        ]
    }
];
