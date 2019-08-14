package zqx.rj.com.playandroid.account.view

import androidx.lifecycle.Observer
import com.zhan.mvvm.ext.Toasts.toast
import com.zhan.mvvm.ext.str
import com.zhan.mvvm.mvvm.LifecycleActivity
import kotlinx.android.synthetic.main.activity_register.*
import zqx.rj.com.playandroid.R
import zqx.rj.com.playandroid.other.context.UserContext
import zqx.rj.com.playandroid.account.vm.AccountViewModel

class RegisterActivity : LifecycleActivity<AccountViewModel>() {

    override fun getLayoutId(): Int = R.layout.activity_register

    override fun initView() {
        super.initView()

        toolbarTitle = getString(R.string.register)

        initListener()
    }

    private fun initListener() {
        mBtnRegister.setOnClickListener {
            viewModel.register(mTieAccount.str(), mTiePassword.str(), mTiePasswordAg.str())
        }
    }


    override fun dataObserver() {
        viewModel.registerData.observe(this, Observer {
            toast(getString(R.string.register_suc))
            UserContext.loginSuccess(it.username, it.collectIds)
            finish()
        })
    }

    override fun onBackPressed() = finish()
}
