import Vue from 'vue'
import VueRouter from "vue-router"

import TestRouter from "@/components/TestRouter";
import MainBox from "@/components/MainBox";

Vue.use(VueRouter)

const routes = [
    {
        path:'/test',
        component:TestRouter
    },
    {
        path:'*',
        component: MainBox
    },
    {
        path:'/mainBox',
        component: MainBox
    }
]

const router = new VueRouter(
    {
        routes
    }
)

export default router
