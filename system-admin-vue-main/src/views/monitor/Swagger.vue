<template>
  <IFrame :src="url" />
</template>

<script>
import IFrame from '../../components/IFrame'
export default {
  name: 'Swagger',
  components: { IFrame },
  data() {
    return {
      url: 'http://127.0.0.1:8081/swagger-ui/index.html',
    }
  },
}
</script>
