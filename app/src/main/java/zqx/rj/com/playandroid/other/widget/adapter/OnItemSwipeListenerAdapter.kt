package zqx.rj.com.playandroid.other.widget.adapter

import android.graphics.Canvas
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.listener.OnItemSwipeListener

/**
 * author：  HyZhan
 * create：  2019/1/2 15:10
 * desc：    侧滑适配器
 */
open class OnItemSwipeListenerAdapter: OnItemSwipeListener {
    override fun clearView(viewHolder: RecyclerView.ViewHolder?, pos: Int) {
    }

    override fun onItemSwiped(viewHolder: RecyclerView.ViewHolder?, pos: Int) {
    }

    override fun onItemSwipeStart(viewHolder: RecyclerView.ViewHolder?, pos: Int) {
    }

    override fun onItemSwipeMoving(canvas: Canvas?, viewHolder: RecyclerView.ViewHolder?, dX: Float, dY: Float, isCurrentlyActive: Boolean) {
    }
}