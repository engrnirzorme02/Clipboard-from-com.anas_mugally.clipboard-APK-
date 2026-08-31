package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C2279d;
import androidx.appcompat.view.menu.C2280e;
import androidx.appcompat.view.menu.C2282g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.widget.U */
/* JADX INFO: loaded from: classes.dex */
public class C2334U extends C2320S implements InterfaceC2324T {

    /* JADX INFO: renamed from: U */
    private static Method f8124U;

    /* JADX INFO: renamed from: T */
    private InterfaceC2324T f8125T;

    /* JADX INFO: renamed from: androidx.appcompat.widget.U$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static void m9940a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* JADX INFO: renamed from: b */
        static void m9941b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.U$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static void m9942a(PopupWindow popupWindow, boolean z7) {
            popupWindow.setTouchModal(z7);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.U$c */
    public static class c extends C2316N {

        /* JADX INFO: renamed from: A */
        private InterfaceC2324T f8126A;

        /* JADX INFO: renamed from: B */
        private MenuItem f8127B;

        /* JADX INFO: renamed from: y */
        final int f8128y;

        /* JADX INFO: renamed from: z */
        final int f8129z;

        public c(Context context, boolean z7) {
            super(context, z7);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f8128y = 21;
                this.f8129z = 22;
            } else {
                this.f8128y = 22;
                this.f8129z = 21;
            }
        }

        @Override // androidx.appcompat.widget.C2316N
        /* JADX INFO: renamed from: d */
        public /* bridge */ /* synthetic */ int mo9786d(int i7, int i8, int i9, int i10, int i11) {
            return super.mo9786d(i7, i8, i9, i10, i11);
        }

        @Override // androidx.appcompat.widget.C2316N
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo9787e(MotionEvent motionEvent, int i7) {
            return super.mo9787e(motionEvent, i7);
        }

        @Override // androidx.appcompat.widget.C2316N, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C2316N, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C2316N, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C2316N, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.C2316N, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            C2279d c2279d;
            int headersCount;
            int iPointToPosition;
            int i7;
            if (this.f8126A != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c2279d = (C2279d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c2279d = (C2279d) adapter;
                    headersCount = 0;
                }
                C2282g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i7 = iPointToPosition - headersCount) < 0 || i7 >= c2279d.getCount()) ? null : c2279d.getItem(i7);
                MenuItem menuItem = this.f8127B;
                if (menuItem != item) {
                    C2280e c2280eM9478b = c2279d.m9478b();
                    if (menuItem != null) {
                        this.f8126A.mo9469i(c2280eM9478b, menuItem);
                    }
                    this.f8127B = item;
                    if (item != null) {
                        this.f8126A.mo9468f(c2280eM9478b, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i7, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i7 == this.f8128y) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i7 != this.f8129z) {
                return super.onKeyDown(i7, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (C2279d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C2279d) adapter).m9478b().m9522e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.C2316N, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC2324T interfaceC2324T) {
            this.f8126A = interfaceC2324T;
        }

        @Override // androidx.appcompat.widget.C2316N, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f8124U = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C2334U(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    /* JADX INFO: renamed from: S */
    public void m9936S(Object obj) {
        a.m9940a(this.f7994Q, (Transition) obj);
    }

    /* JADX INFO: renamed from: T */
    public void m9937T(Object obj) {
        a.m9941b(this.f7994Q, (Transition) obj);
    }

    /* JADX INFO: renamed from: U */
    public void m9938U(InterfaceC2324T interfaceC2324T) {
        this.f8125T = interfaceC2324T;
    }

    /* JADX INFO: renamed from: V */
    public void m9939V(boolean z7) {
        if (Build.VERSION.SDK_INT > 28) {
            b.m9942a(this.f7994Q, z7);
            return;
        }
        Method method = f8124U;
        if (method != null) {
            try {
                method.invoke(this.f7994Q, Boolean.valueOf(z7));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC2324T
    /* JADX INFO: renamed from: f */
    public void mo9468f(C2280e c2280e, MenuItem menuItem) {
        InterfaceC2324T interfaceC2324T = this.f8125T;
        if (interfaceC2324T != null) {
            interfaceC2324T.mo9468f(c2280e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC2324T
    /* JADX INFO: renamed from: i */
    public void mo9469i(C2280e c2280e, MenuItem menuItem) {
        InterfaceC2324T interfaceC2324T = this.f8125T;
        if (interfaceC2324T != null) {
            interfaceC2324T.mo9469i(c2280e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C2320S
    /* JADX INFO: renamed from: s */
    C2316N mo9853s(Context context, boolean z7) {
        c cVar = new c(context, z7);
        cVar.setHoverListener(this);
        return cVar;
    }
}
