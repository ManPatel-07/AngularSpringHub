import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'lazyadmin', loadChildren: () => import('./lazyload/lazyadmin/lazyadmin.module')
                                            .then(mod => mod.LazyadminModule) 
  },
  {
    path: 'lazyuser', loadChildren: () => import('./lazyload/lazyuser/lazyuser.module')
                                            .then(mod => mod.LazyuserModule)  
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
