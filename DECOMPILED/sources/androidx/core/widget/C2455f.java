package androidx.core.widget;

import android.widget.ListView;

/* JADX INFO: renamed from: androidx.core.widget.f */
/* JADX INFO: loaded from: classes.dex */
public class C2455f extends AbstractViewOnTouchListenerC2450a {

    /* JADX INFO: renamed from: D */
    private final ListView f9372D;

    public C2455f(ListView listView) {
        super(listView);
        this.f9372D = listView;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC2450a
    /* JADX INFO: renamed from: a */
    public boolean mo10685a(int i7) {
        return false;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC2450a
    /* JADX INFO: renamed from: b */
    public boolean mo10686b(int i7) {
        ListView listView = this.f9372D;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i8 = firstVisiblePosition + childCount;
        if (i7 > 0) {
            if (i8 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i7 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC2450a
    /* JADX INFO: renamed from: j */
    public void mo10688j(int i7, int i8) {
        this.f9372D.scrollListBy(i8);
    }
}
