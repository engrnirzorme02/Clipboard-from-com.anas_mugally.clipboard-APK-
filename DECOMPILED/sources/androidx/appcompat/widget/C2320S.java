package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.widget.AbstractC2457h;
import com.google.android.gms.common.api.C3553a;
import java.lang.reflect.Method;
import p255h.AbstractC5520a;
import p255h.AbstractC5529j;
import p295m.InterfaceC6318e;

/* JADX INFO: renamed from: androidx.appcompat.widget.S */
/* JADX INFO: loaded from: classes.dex */
public class C2320S implements InterfaceC6318e {

    /* JADX INFO: renamed from: R */
    private static Method f7976R;

    /* JADX INFO: renamed from: S */
    private static Method f7977S;

    /* JADX INFO: renamed from: A */
    private View f7978A;

    /* JADX INFO: renamed from: B */
    private int f7979B;

    /* JADX INFO: renamed from: C */
    private DataSetObserver f7980C;

    /* JADX INFO: renamed from: D */
    private View f7981D;

    /* JADX INFO: renamed from: E */
    private Drawable f7982E;

    /* JADX INFO: renamed from: F */
    private AdapterView.OnItemClickListener f7983F;

    /* JADX INFO: renamed from: G */
    private AdapterView.OnItemSelectedListener f7984G;

    /* JADX INFO: renamed from: H */
    final i f7985H;

    /* JADX INFO: renamed from: I */
    private final h f7986I;

    /* JADX INFO: renamed from: J */
    private final g f7987J;

    /* JADX INFO: renamed from: K */
    private final e f7988K;

    /* JADX INFO: renamed from: L */
    private Runnable f7989L;

    /* JADX INFO: renamed from: M */
    final Handler f7990M;

    /* JADX INFO: renamed from: N */
    private final Rect f7991N;

    /* JADX INFO: renamed from: O */
    private Rect f7992O;

    /* JADX INFO: renamed from: P */
    private boolean f7993P;

    /* JADX INFO: renamed from: Q */
    PopupWindow f7994Q;

    /* JADX INFO: renamed from: a */
    private Context f7995a;

    /* JADX INFO: renamed from: b */
    private ListAdapter f7996b;

    /* JADX INFO: renamed from: c */
    C2316N f7997c;

    /* JADX INFO: renamed from: d */
    private int f7998d;

    /* JADX INFO: renamed from: e */
    private int f7999e;

    /* JADX INFO: renamed from: f */
    private int f8000f;

    /* JADX INFO: renamed from: r */
    private int f8001r;

    /* JADX INFO: renamed from: s */
    private int f8002s;

    /* JADX INFO: renamed from: t */
    private boolean f8003t;

    /* JADX INFO: renamed from: u */
    private boolean f8004u;

    /* JADX INFO: renamed from: v */
    private boolean f8005v;

    /* JADX INFO: renamed from: w */
    private int f8006w;

    /* JADX INFO: renamed from: x */
    private boolean f8007x;

    /* JADX INFO: renamed from: y */
    private boolean f8008y;

    /* JADX INFO: renamed from: z */
    int f8009z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewM9854t = C2320S.this.m9854t();
            if (viewM9854t == null || viewM9854t.getWindowToken() == null) {
                return;
            }
            C2320S.this.mo9454b();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$b */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
            C2316N c2316n;
            if (i7 == -1 || (c2316n = C2320S.this.f7997c) == null) {
                return;
            }
            c2316n.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static int m9860a(PopupWindow popupWindow, View view, int i7, boolean z7) {
            return popupWindow.getMaxAvailableHeight(view, i7, z7);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$d */
    static class d {
        /* JADX INFO: renamed from: a */
        static void m9861a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* JADX INFO: renamed from: b */
        static void m9862b(PopupWindow popupWindow, boolean z7) {
            popupWindow.setIsClippedToScreen(z7);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$e */
    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2320S.this.m9852r();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$f */
    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C2320S.this.mo9453a()) {
                C2320S.this.mo9454b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C2320S.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$g */
    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i7, int i8, int i9) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i7) {
            if (i7 != 1 || C2320S.this.m9829A() || C2320S.this.f7994Q.getContentView() == null) {
                return;
            }
            C2320S c2320s = C2320S.this;
            c2320s.f7990M.removeCallbacks(c2320s.f7985H);
            C2320S.this.f7985H.run();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$h */
    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C2320S.this.f7994Q) != null && popupWindow.isShowing() && x7 >= 0 && x7 < C2320S.this.f7994Q.getWidth() && y7 >= 0 && y7 < C2320S.this.f7994Q.getHeight()) {
                C2320S c2320s = C2320S.this;
                c2320s.f7990M.postDelayed(c2320s.f7985H, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C2320S c2320s2 = C2320S.this;
            c2320s2.f7990M.removeCallbacks(c2320s2.f7985H);
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.S$i */
    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2316N c2316n = C2320S.this.f7997c;
            if (c2316n == null || !c2316n.isAttachedToWindow() || C2320S.this.f7997c.getCount() <= C2320S.this.f7997c.getChildCount()) {
                return;
            }
            int childCount = C2320S.this.f7997c.getChildCount();
            C2320S c2320s = C2320S.this;
            if (childCount <= c2320s.f8009z) {
                c2320s.f7994Q.setInputMethodMode(2);
                C2320S.this.mo9454b();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f7976R = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f7977S = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C2320S(Context context) {
        this(context, null, AbstractC5520a.f20953D);
    }

    /* JADX INFO: renamed from: C */
    private void m9825C() {
        View view = this.f7978A;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f7978A);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    private void m9826O(boolean z7) {
        if (Build.VERSION.SDK_INT > 28) {
            d.m9862b(this.f7994Q, z7);
            return;
        }
        Method method = f7976R;
        if (method != null) {
            try {
                method.invoke(this.f7994Q, Boolean.valueOf(z7));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX INFO: renamed from: q */
    private int m9827q() {
        int measuredHeight;
        int i7;
        int iMakeMeasureSpec;
        View view;
        int i8;
        if (this.f7997c == null) {
            Context context = this.f7995a;
            this.f7989L = new a();
            C2316N c2316nMo9853s = mo9853s(context, !this.f7993P);
            this.f7997c = c2316nMo9853s;
            Drawable drawable = this.f7982E;
            if (drawable != null) {
                c2316nMo9853s.setSelector(drawable);
            }
            this.f7997c.setAdapter(this.f7996b);
            this.f7997c.setOnItemClickListener(this.f7983F);
            this.f7997c.setFocusable(true);
            this.f7997c.setFocusableInTouchMode(true);
            this.f7997c.setOnItemSelectedListener(new b());
            this.f7997c.setOnScrollListener(this.f7987J);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f7984G;
            if (onItemSelectedListener != null) {
                this.f7997c.setOnItemSelectedListener(onItemSelectedListener);
            }
            C2316N c2316n = this.f7997c;
            View view2 = this.f7978A;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i9 = this.f7979B;
                if (i9 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(c2316n, layoutParams);
                } else if (i9 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f7979B);
                } else {
                    linearLayout.addView(c2316n, layoutParams);
                    linearLayout.addView(view2);
                }
                int i10 = this.f7999e;
                if (i10 >= 0) {
                    i8 = Integer.MIN_VALUE;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i10, i8), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = c2316n;
            }
            this.f7994Q.setContentView(view);
        } else {
            View view3 = this.f7978A;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f7994Q.getBackground();
        if (background != null) {
            background.getPadding(this.f7991N);
            Rect rect = this.f7991N;
            int i11 = rect.top;
            i7 = rect.bottom + i11;
            if (!this.f8003t) {
                this.f8001r = -i11;
            }
        } else {
            this.f7991N.setEmpty();
            i7 = 0;
        }
        int iM9828u = m9828u(m9854t(), this.f8001r, this.f7994Q.getInputMethodMode() == 2);
        if (this.f8007x || this.f7998d == -1) {
            return iM9828u + i7;
        }
        int i12 = this.f7999e;
        if (i12 == -2) {
            int i13 = this.f7995a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f7991N;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i12 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else {
            int i14 = this.f7995a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f7991N;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - (rect3.left + rect3.right), 1073741824);
        }
        int iMo9786d = this.f7997c.mo9786d(iMakeMeasureSpec, 0, -1, iM9828u - measuredHeight, -1);
        if (iMo9786d > 0) {
            measuredHeight += i7 + this.f7997c.getPaddingTop() + this.f7997c.getPaddingBottom();
        }
        return iMo9786d + measuredHeight;
    }

    /* JADX INFO: renamed from: u */
    private int m9828u(View view, int i7, boolean z7) {
        return c.m9860a(this.f7994Q, view, i7, z7);
    }

    /* JADX INFO: renamed from: A */
    public boolean m9829A() {
        return this.f7994Q.getInputMethodMode() == 2;
    }

    /* JADX INFO: renamed from: B */
    public boolean m9830B() {
        return this.f7993P;
    }

    /* JADX INFO: renamed from: D */
    public void m9831D(View view) {
        this.f7981D = view;
    }

    /* JADX INFO: renamed from: E */
    public void m9832E(int i7) {
        this.f7994Q.setAnimationStyle(i7);
    }

    /* JADX INFO: renamed from: F */
    public void m9833F(int i7) {
        Drawable background = this.f7994Q.getBackground();
        if (background == null) {
            m9844R(i7);
            return;
        }
        background.getPadding(this.f7991N);
        Rect rect = this.f7991N;
        this.f7999e = rect.left + rect.right + i7;
    }

    /* JADX INFO: renamed from: G */
    public void m9834G(int i7) {
        this.f8006w = i7;
    }

    /* JADX INFO: renamed from: H */
    public void m9835H(Rect rect) {
        this.f7992O = rect != null ? new Rect(rect) : null;
    }

    /* JADX INFO: renamed from: I */
    public void m9836I(int i7) {
        this.f7994Q.setInputMethodMode(i7);
    }

    /* JADX INFO: renamed from: J */
    public void m9837J(boolean z7) {
        this.f7993P = z7;
        this.f7994Q.setFocusable(z7);
    }

    /* JADX INFO: renamed from: K */
    public void m9838K(PopupWindow.OnDismissListener onDismissListener) {
        this.f7994Q.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: L */
    public void m9839L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f7983F = onItemClickListener;
    }

    /* JADX INFO: renamed from: M */
    public void m9840M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f7984G = onItemSelectedListener;
    }

    /* JADX INFO: renamed from: N */
    public void m9841N(boolean z7) {
        this.f8005v = true;
        this.f8004u = z7;
    }

    /* JADX INFO: renamed from: P */
    public void m9842P(int i7) {
        this.f7979B = i7;
    }

    /* JADX INFO: renamed from: Q */
    public void m9843Q(int i7) {
        C2316N c2316n = this.f7997c;
        if (!mo9453a() || c2316n == null) {
            return;
        }
        c2316n.setListSelectionHidden(false);
        c2316n.setSelection(i7);
        if (c2316n.getChoiceMode() != 0) {
            c2316n.setItemChecked(i7, true);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m9844R(int i7) {
        this.f7999e = i7;
    }

    @Override // p295m.InterfaceC6318e
    /* JADX INFO: renamed from: a */
    public boolean mo9453a() {
        return this.f7994Q.isShowing();
    }

    @Override // p295m.InterfaceC6318e
    /* JADX INFO: renamed from: b */
    public void mo9454b() {
        int iM9827q = m9827q();
        boolean zM9829A = m9829A();
        AbstractC2457h.m10746b(this.f7994Q, this.f8002s);
        if (this.f7994Q.isShowing()) {
            if (m9854t().isAttachedToWindow()) {
                int width = this.f7999e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = m9854t().getWidth();
                }
                int i7 = this.f7998d;
                if (i7 == -1) {
                    if (!zM9829A) {
                        iM9827q = -1;
                    }
                    if (zM9829A) {
                        this.f7994Q.setWidth(this.f7999e == -1 ? -1 : 0);
                        this.f7994Q.setHeight(0);
                    } else {
                        this.f7994Q.setWidth(this.f7999e == -1 ? -1 : 0);
                        this.f7994Q.setHeight(-1);
                    }
                } else if (i7 != -2) {
                    iM9827q = i7;
                }
                this.f7994Q.setOutsideTouchable((this.f8008y || this.f8007x) ? false : true);
                this.f7994Q.update(m9854t(), this.f8000f, this.f8001r, width < 0 ? -1 : width, iM9827q < 0 ? -1 : iM9827q);
                return;
            }
            return;
        }
        int width2 = this.f7999e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = m9854t().getWidth();
        }
        int i8 = this.f7998d;
        if (i8 == -1) {
            iM9827q = -1;
        } else if (i8 != -2) {
            iM9827q = i8;
        }
        this.f7994Q.setWidth(width2);
        this.f7994Q.setHeight(iM9827q);
        m9826O(true);
        this.f7994Q.setOutsideTouchable((this.f8008y || this.f8007x) ? false : true);
        this.f7994Q.setTouchInterceptor(this.f7986I);
        if (this.f8005v) {
            AbstractC2457h.m10745a(this.f7994Q, this.f8004u);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f7977S;
            if (method != null) {
                try {
                    method.invoke(this.f7994Q, this.f7992O);
                } catch (Exception e7) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            d.m9861a(this.f7994Q, this.f7992O);
        }
        AbstractC2457h.m10747c(this.f7994Q, m9854t(), this.f8000f, this.f8001r, this.f8006w);
        this.f7997c.setSelection(-1);
        if (!this.f7993P || this.f7997c.isInTouchMode()) {
            m9852r();
        }
        if (this.f7993P) {
            return;
        }
        this.f7990M.post(this.f7988K);
    }

    /* JADX INFO: renamed from: c */
    public Drawable m9845c() {
        return this.f7994Q.getBackground();
    }

    /* JADX INFO: renamed from: d */
    public void m9846d(Drawable drawable) {
        this.f7994Q.setBackgroundDrawable(drawable);
    }

    @Override // p295m.InterfaceC6318e
    public void dismiss() {
        this.f7994Q.dismiss();
        m9825C();
        this.f7994Q.setContentView(null);
        this.f7997c = null;
        this.f7990M.removeCallbacks(this.f7985H);
    }

    /* JADX INFO: renamed from: e */
    public int m9847e() {
        return this.f8000f;
    }

    /* JADX INFO: renamed from: g */
    public void m9848g(int i7) {
        this.f8000f = i7;
    }

    @Override // p295m.InterfaceC6318e
    /* JADX INFO: renamed from: k */
    public ListView mo9457k() {
        return this.f7997c;
    }

    /* JADX INFO: renamed from: l */
    public void m9849l(int i7) {
        this.f8001r = i7;
        this.f8003t = true;
    }

    /* JADX INFO: renamed from: o */
    public int m9850o() {
        if (this.f8003t) {
            return this.f8001r;
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public void mo9851p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f7980C;
        if (dataSetObserver == null) {
            this.f7980C = new f();
        } else {
            ListAdapter listAdapter2 = this.f7996b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f7996b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f7980C);
        }
        C2316N c2316n = this.f7997c;
        if (c2316n != null) {
            c2316n.setAdapter(this.f7996b);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m9852r() {
        C2316N c2316n = this.f7997c;
        if (c2316n != null) {
            c2316n.setListSelectionHidden(true);
            c2316n.requestLayout();
        }
    }

    /* JADX INFO: renamed from: s */
    C2316N mo9853s(Context context, boolean z7) {
        return new C2316N(context, z7);
    }

    /* JADX INFO: renamed from: t */
    public View m9854t() {
        return this.f7981D;
    }

    /* JADX INFO: renamed from: v */
    public Object m9855v() {
        if (mo9453a()) {
            return this.f7997c.getSelectedItem();
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public long m9856w() {
        if (mo9453a()) {
            return this.f7997c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: x */
    public int m9857x() {
        if (mo9453a()) {
            return this.f7997c.getSelectedItemPosition();
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public View m9858y() {
        if (mo9453a()) {
            return this.f7997c.getSelectedView();
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public int m9859z() {
        return this.f7999e;
    }

    public C2320S(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public C2320S(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f7998d = -2;
        this.f7999e = -2;
        this.f8002s = 1002;
        this.f8006w = 0;
        this.f8007x = false;
        this.f8008y = false;
        this.f8009z = C3553a.e.API_PRIORITY_OTHER;
        this.f7979B = 0;
        this.f7985H = new i();
        this.f7986I = new h();
        this.f7987J = new g();
        this.f7988K = new e();
        this.f7991N = new Rect();
        this.f7995a = context;
        this.f7990M = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5529j.f21282l1, i7, i8);
        this.f8000f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5529j.f21287m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5529j.f21292n1, 0);
        this.f8001r = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f8003t = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C2369r c2369r = new C2369r(context, attributeSet, i7, i8);
        this.f7994Q = c2369r;
        c2369r.setInputMethodMode(1);
    }
}
