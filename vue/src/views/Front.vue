<template>
  <div style="background-color: #f8f8f8;min-height: 100vh ">
<!--    头部-->
    <div class="front-header">
      <a href="/front/home">
        <div class="front-header-left">
          <img src="@/assets/imgs/logo.png" alt="">
          <div class="title">闲置物品流通网</div>
        </div>
      </a>
      <div class="front-header-center">
       <div @click="$router.push(item.path)" class="menu" v-for="item in menus" :key="item.path"
            :class="{'menu-active' : item.path === $route.path}">{{item.text}}</div>
      </div>
      <div>
        <span @click="$router.push('/front/chat')" style="font-size: 16px; color: white; cursor: pointer"><i class="el-icon-chat-dot-round"></i> 聊天消息</span>
      </div>
      <div class="front-header-right">
        <div v-if="!user.username">
          <el-button @click="$router.push('/login')">登录</el-button>
          <el-button @click="$router.push('/register')">注册</el-button>
        </div>
        <div v-else>
          <el-dropdown>
            <div class="front-header-dropdown">
              <img :src="user.avatar" alt="" style="border-radius: 50%">
              <div style="margin-left: 10px; color: #eee; cursor: pointer">
                <span>{{ user.name }}</span><i class="el-icon-arrow-down" style="margin-left: 5px"></i>
              </div>
            </div>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item>
                <div  @click="$router.push('/front/orders')">我的订单</div>
              </el-dropdown-item>
              <el-dropdown-item>
                <div  @click="$router.push('/front/goods')">我的商品</div>
              </el-dropdown-item>
              <el-dropdown-item>
                <div  @click="$router.push('/front/userPosts')">我的发帖</div>
              </el-dropdown-item>
              <el-dropdown-item>
                <div  @click="$router.push('/front/userHelp')">我的求购</div>
              </el-dropdown-item>
              <el-dropdown-item>
                <div  @click="$router.push('/front/userFeedback')">我的反馈</div>
              </el-dropdown-item>
              <el-dropdown-item>
                <div  @click="$router.push('/front/address')">我的地址</div>
              </el-dropdown-item>
              <el-dropdown-item>
                <div  @click="$router.push('/front/person')">个人信息</div>
              </el-dropdown-item>
              <el-dropdown-item>
                <div  @click="$router.push('/front/collect')">我的收藏</div>
              </el-dropdown-item>
              <el-dropdown-item>
                <div style="text-decoration: none" @click="logout">退出登录</div>
              </el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
        </div>
      </div>
    </div>
    <!--主体-->
    <div class="main-body">
      <router-view ref="child" @update:user="updateUser" />
    </div>
    <Footer/>
  </div>

</template>

<script>
import Footer from "@/components/Footer";
import router from "@/router";
export default {
  name: "FrontLayout",
  components: {
    Footer
  },
  data () {
    return {
      notice: [],
      user: JSON.parse(localStorage.getItem("xm-user") || '{}'),
      menus: [
        {text:'热卖专区',path:'/front/home'},
        {text:'社区广场',path:'/front/posts'},
        {text:'求购专区',path:'/front/help'},
        {text:'系统公告',path:'/front/notice'},
        {text:'留言反馈',path:'/front/feedback'},
      ]
    }
  },

  mounted() {

  },
  methods: {

    updateUser() {
      this.user = JSON.parse(localStorage.getItem('xm-user') || '{}')   // 重新获取下用户的最新信息
    },
    // 退出登录
    logout() {
      localStorage.removeItem("xm-user");
      this.$router.push("/login");
    },
  }

}
</script>

<style scoped>
  @import "@/assets/css/front.css";
  .menu{
    color: #eee;
    font-size: 16px;
    padding: 0 20px;
    cursor: pointer;
  }

  .menu:hover{
    color: orange;
  }
  .menu-active{
    color: orange;
  }
</style>