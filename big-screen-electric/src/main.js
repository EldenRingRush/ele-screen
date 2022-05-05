import Vue from 'vue'
import App from './App.vue'
import router from '@/router'
import vueRouter from 'vue-router'
import echarts from 'echarts'
import './assets/common.less'
import dataV from '@jiaminghi/data-view'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import Axios from "axios";

Vue.config.productionTip = false
Vue.prototype.$echarts=echarts


Vue.use(dataV)
Vue.use(vueRouter)
Vue.use(ElementUI)
Vue.use(Axios)

new Vue({
    render: h => h(App),
    router
}).$mount('#app')