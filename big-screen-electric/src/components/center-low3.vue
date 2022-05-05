<template>
<div>
  <dv-capsule-chart :config="config" style="width:100%;height:90%" />
</div>
</template>

<script>
export default {
  data(){
    return{
      config:{
          showValue:true,
          data: [
            {
              name: '设备1',
              value: 45
            },
            {
              name: '设备2',
              value: 33
            },
            {
              name: '设备3',
              value: 24
            },

          ],
          colors: ['#e062ae', '#fb7293', '#e690d1'],
          unit:'℃'

      }
    }
  }
}
</script>

<style scoped>

</style>