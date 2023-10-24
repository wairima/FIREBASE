package com.chris.firebase.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chris.firebase.ui.theme.screen.about.AboutScreen
import com.chris.firebase.ui.theme.screen.home.HomeScreen
import com.chris.firebase.ui.theme.screen.login.LoginScreen
import com.chris.firebase.ui.theme.screen.product.AddProduct
import com.chris.firebase.ui.theme.screen.product.UpdateProductsScreen
import com.chris.firebase.ui.theme.screen.product.ViewProductsScreen
import com.chris.firebase.ui.theme.screen.product.ViewUploadScreen
import com.chris.firebase.ui.theme.screen.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),startDestination:String= ROUTE_LOGIN) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddProduct(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadScreen(navController)
        }

    }

}