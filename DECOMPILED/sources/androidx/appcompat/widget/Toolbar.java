package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC2240a;
import androidx.appcompat.view.C2271g;
import androidx.appcompat.view.InterfaceC2267c;
import androidx.appcompat.view.menu.C2280e;
import androidx.appcompat.view.menu.C2282g;
import androidx.appcompat.view.menu.InterfaceC2285j;
import androidx.appcompat.view.menu.SubMenuC2288m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p111O.AbstractC1030Z;
import p111O.AbstractC1074t;
import p111O.C1082x;
import p111O.InterfaceC1080w;
import p111O.InterfaceC1086z;
import p146T.AbstractC1446a;
import p255h.AbstractC5520a;
import p255h.AbstractC5529j;
import p263i.AbstractC5659a;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC1080w {

    /* JADX INFO: renamed from: A */
    private int f8068A;

    /* JADX INFO: renamed from: B */
    private int f8069B;

    /* JADX INFO: renamed from: C */
    private int f8070C;

    /* JADX INFO: renamed from: D */
    private int f8071D;

    /* JADX INFO: renamed from: E */
    private C2338X f8072E;

    /* JADX INFO: renamed from: F */
    private int f8073F;

    /* JADX INFO: renamed from: G */
    private int f8074G;

    /* JADX INFO: renamed from: H */
    private int f8075H;

    /* JADX INFO: renamed from: I */
    private CharSequence f8076I;

    /* JADX INFO: renamed from: J */
    private CharSequence f8077J;

    /* JADX INFO: renamed from: K */
    private ColorStateList f8078K;

    /* JADX INFO: renamed from: L */
    private ColorStateList f8079L;

    /* JADX INFO: renamed from: M */
    private boolean f8080M;

    /* JADX INFO: renamed from: N */
    private boolean f8081N;

    /* JADX INFO: renamed from: O */
    private final ArrayList f8082O;

    /* JADX INFO: renamed from: P */
    private final ArrayList f8083P;

    /* JADX INFO: renamed from: Q */
    private final int[] f8084Q;

    /* JADX INFO: renamed from: R */
    final C1082x f8085R;

    /* JADX INFO: renamed from: S */
    private ArrayList f8086S;

    /* JADX INFO: renamed from: T */
    InterfaceC2332h f8087T;

    /* JADX INFO: renamed from: U */
    private final ActionMenuView.InterfaceC2302e f8088U;

    /* JADX INFO: renamed from: V */
    private C2356h0 f8089V;

    /* JADX INFO: renamed from: W */
    private C2345c f8090W;

    /* JADX INFO: renamed from: a */
    ActionMenuView f8091a;

    /* JADX INFO: renamed from: a0 */
    private C2330f f8092a0;

    /* JADX INFO: renamed from: b */
    private TextView f8093b;

    /* JADX INFO: renamed from: b0 */
    private InterfaceC2285j.a f8094b0;

    /* JADX INFO: renamed from: c */
    private TextView f8095c;

    /* JADX INFO: renamed from: c0 */
    C2280e.a f8096c0;

    /* JADX INFO: renamed from: d */
    private ImageButton f8097d;

    /* JADX INFO: renamed from: d0 */
    private boolean f8098d0;

    /* JADX INFO: renamed from: e */
    private ImageView f8099e;

    /* JADX INFO: renamed from: e0 */
    private OnBackInvokedCallback f8100e0;

    /* JADX INFO: renamed from: f */
    private Drawable f8101f;

    /* JADX INFO: renamed from: f0 */
    private OnBackInvokedDispatcher f8102f0;

    /* JADX INFO: renamed from: g0 */
    private boolean f8103g0;

    /* JADX INFO: renamed from: h0 */
    private final Runnable f8104h0;

    /* JADX INFO: renamed from: r */
    private CharSequence f8105r;

    /* JADX INFO: renamed from: s */
    ImageButton f8106s;

    /* JADX INFO: renamed from: t */
    View f8107t;

    /* JADX INFO: renamed from: u */
    private Context f8108u;

    /* JADX INFO: renamed from: v */
    private int f8109v;

    /* JADX INFO: renamed from: w */
    private int f8110w;

    /* JADX INFO: renamed from: x */
    private int f8111x;

    /* JADX INFO: renamed from: y */
    int f8112y;

    /* JADX INFO: renamed from: z */
    private int f8113z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$a */
    class C2325a implements ActionMenuView.InterfaceC2302e {
        C2325a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC2302e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f8085R.m4788d(menuItem)) {
                return true;
            }
            InterfaceC2332h interfaceC2332h = Toolbar.this.f8087T;
            if (interfaceC2332h != null) {
                return interfaceC2332h.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$b */
    class RunnableC2326b implements Runnable {
        RunnableC2326b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m9915R();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$c */
    class C2327c implements C2280e.a {
        C2327c() {
        }

        @Override // androidx.appcompat.view.menu.C2280e.a
        /* JADX INFO: renamed from: a */
        public boolean mo9231a(C2280e c2280e, MenuItem menuItem) {
            C2280e.a aVar = Toolbar.this.f8096c0;
            return aVar != null && aVar.mo9231a(c2280e, menuItem);
        }

        @Override // androidx.appcompat.view.menu.C2280e.a
        /* JADX INFO: renamed from: b */
        public void mo9233b(C2280e c2280e) {
            if (!Toolbar.this.f8091a.m9670J()) {
                Toolbar.this.f8085R.m4789e(c2280e);
            }
            C2280e.a aVar = Toolbar.this.f8096c0;
            if (aVar != null) {
                aVar.mo9233b(c2280e);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$d */
    class ViewOnClickListenerC2328d implements View.OnClickListener {
        ViewOnClickListenerC2328d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m9919f();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$e */
    static class C2329e {
        /* JADX INFO: renamed from: a */
        static OnBackInvokedDispatcher m9928a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        /* JADX INFO: renamed from: b */
        static OnBackInvokedCallback m9929b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.g0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        /* JADX INFO: renamed from: c */
        static void m9930c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        /* JADX INFO: renamed from: d */
        static void m9931d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$f */
    private class C2330f implements InterfaceC2285j {

        /* JADX INFO: renamed from: a */
        C2280e f8118a;

        /* JADX INFO: renamed from: b */
        C2282g f8119b;

        C2330f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j
        /* JADX INFO: renamed from: c */
        public void mo9432c(C2280e c2280e, boolean z7) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j
        /* JADX INFO: renamed from: d */
        public void mo9433d(boolean z7) {
            if (this.f8119b != null) {
                C2280e c2280e = this.f8118a;
                if (c2280e != null) {
                    int size = c2280e.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (this.f8118a.getItem(i7) == this.f8119b) {
                            return;
                        }
                    }
                }
                mo9434f(this.f8118a, this.f8119b);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j
        /* JADX INFO: renamed from: e */
        public boolean mo9455e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j
        /* JADX INFO: renamed from: f */
        public boolean mo9434f(C2280e c2280e, C2282g c2282g) {
            KeyEvent.Callback callback = Toolbar.this.f8107t;
            if (callback instanceof InterfaceC2267c) {
                ((InterfaceC2267c) callback).mo9377f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f8107t);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f8106s);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f8107t = null;
            toolbar3.m9917a();
            this.f8119b = null;
            Toolbar.this.requestLayout();
            c2282g.m9561r(false);
            Toolbar.this.m9916S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j
        /* JADX INFO: renamed from: g */
        public boolean mo9435g(C2280e c2280e, C2282g c2282g) {
            Toolbar.this.m9921h();
            ViewParent parent = Toolbar.this.f8106s.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f8106s);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f8106s);
            }
            Toolbar.this.f8107t = c2282g.getActionView();
            this.f8119b = c2282g;
            ViewParent parent2 = Toolbar.this.f8107t.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f8107t);
                }
                C2331g c2331gGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                c2331gGenerateDefaultLayoutParams.f7313a = (toolbar4.f8112y & 112) | 8388611;
                c2331gGenerateDefaultLayoutParams.f8121b = 2;
                toolbar4.f8107t.setLayoutParams(c2331gGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f8107t);
            }
            Toolbar.this.m9910K();
            Toolbar.this.requestLayout();
            c2282g.m9561r(true);
            KeyEvent.Callback callback = Toolbar.this.f8107t;
            if (callback instanceof InterfaceC2267c) {
                ((InterfaceC2267c) callback).mo9376c();
            }
            Toolbar.this.m9916S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j
        /* JADX INFO: renamed from: i */
        public void mo9437i(Context context, C2280e c2280e) {
            C2282g c2282g;
            C2280e c2280e2 = this.f8118a;
            if (c2280e2 != null && (c2282g = this.f8119b) != null) {
                c2280e2.mo9524f(c2282g);
            }
            this.f8118a = c2280e;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j
        /* JADX INFO: renamed from: j */
        public void mo9456j(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j
        /* JADX INFO: renamed from: l */
        public boolean mo9439l(SubMenuC2288m subMenuC2288m) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j
        /* JADX INFO: renamed from: m */
        public Parcelable mo9458m() {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$h */
    public interface InterfaceC2332h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20962M);
    }

    /* JADX INFO: renamed from: B */
    private boolean m9885B(View view) {
        return view.getParent() == this || this.f8083P.contains(view);
    }

    /* JADX INFO: renamed from: E */
    private int m9886E(View view, int i7, int[] iArr, int i8) {
        C2331g c2331g = (C2331g) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) c2331g).leftMargin - iArr[0];
        int iMax = i7 + Math.max(0, i9);
        iArr[0] = Math.max(0, -i9);
        int iM9902r = m9902r(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM9902r, iMax + measuredWidth, view.getMeasuredHeight() + iM9902r);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) c2331g).rightMargin;
    }

    /* JADX INFO: renamed from: F */
    private int m9887F(View view, int i7, int[] iArr, int i8) {
        C2331g c2331g = (C2331g) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) c2331g).rightMargin - iArr[1];
        int iMax = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int iM9902r = m9902r(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM9902r, iMax, view.getMeasuredHeight() + iM9902r);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c2331g).leftMargin);
    }

    /* JADX INFO: renamed from: G */
    private int m9888G(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i11) + Math.max(0, i12);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + iMax + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: H */
    private void m9889H(View view, int i7, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i11 >= 0) {
            if (mode != 0) {
                i11 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i11);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: I */
    private void m9890I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f8085R.m4786b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f8086S = currentMenuItems2;
    }

    /* JADX INFO: renamed from: J */
    private void m9891J() {
        removeCallbacks(this.f8104h0);
        post(this.f8104h0);
    }

    /* JADX INFO: renamed from: P */
    private boolean m9892P() {
        if (!this.f8098d0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (m9893Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Q */
    private boolean m9893Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    private void m9894b(List list, int i7) {
        boolean z7 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iM4771b = AbstractC1074t.m4771b(i7, getLayoutDirection());
        list.clear();
        if (!z7) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                C2331g c2331g = (C2331g) childAt.getLayoutParams();
                if (c2331g.f8121b == 0 && m9893Q(childAt) && m9901q(c2331g.f7313a) == iM4771b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            C2331g c2331g2 = (C2331g) childAt2.getLayoutParams();
            if (c2331g2.f8121b == 0 && m9893Q(childAt2) && m9901q(c2331g2.f7313a) == iM4771b) {
                list.add(childAt2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m9895c(View view, boolean z7) {
        C2331g c2331gGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c2331gGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            c2331gGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C2331g) layoutParams;
        }
        c2331gGenerateLayoutParams.f8121b = 1;
        if (!z7 || this.f8107t == null) {
            addView(view, c2331gGenerateLayoutParams);
        } else {
            view.setLayoutParams(c2331gGenerateLayoutParams);
            this.f8083P.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C2271g(getContext());
    }

    /* JADX INFO: renamed from: i */
    private void m9896i() {
        if (this.f8072E == null) {
            this.f8072E = new C2338X();
        }
    }

    /* JADX INFO: renamed from: j */
    private void m9897j() {
        if (this.f8099e == null) {
            this.f8099e = new AppCompatImageView(getContext());
        }
    }

    /* JADX INFO: renamed from: k */
    private void m9898k() {
        m9899l();
        if (this.f8091a.m9672N() == null) {
            C2280e c2280e = (C2280e) this.f8091a.getMenu();
            if (this.f8092a0 == null) {
                this.f8092a0 = new C2330f();
            }
            this.f8091a.setExpandedActionViewsExclusive(true);
            c2280e.m9518c(this.f8092a0, this.f8108u);
            m9916S();
        }
    }

    /* JADX INFO: renamed from: l */
    private void m9899l() {
        if (this.f8091a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f8091a = actionMenuView;
            actionMenuView.setPopupTheme(this.f8109v);
            this.f8091a.setOnMenuItemClickListener(this.f8088U);
            this.f8091a.m9673O(this.f8094b0, new C2327c());
            C2331g c2331gGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c2331gGenerateDefaultLayoutParams.f7313a = (this.f8112y & 112) | 8388613;
            this.f8091a.setLayoutParams(c2331gGenerateDefaultLayoutParams);
            m9895c(this.f8091a, false);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m9900m() {
        if (this.f8097d == null) {
            this.f8097d = new C2366o(getContext(), null, AbstractC5520a.f20961L);
            C2331g c2331gGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c2331gGenerateDefaultLayoutParams.f7313a = (this.f8112y & 112) | 8388611;
            this.f8097d.setLayoutParams(c2331gGenerateDefaultLayoutParams);
        }
    }

    /* JADX INFO: renamed from: q */
    private int m9901q(int i7) {
        int layoutDirection = getLayoutDirection();
        int iM4771b = AbstractC1074t.m4771b(i7, layoutDirection) & 7;
        if (iM4771b == 1 || iM4771b == 3 || iM4771b == 5) {
            return iM4771b;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    /* JADX INFO: renamed from: r */
    private int m9902r(View view, int i7) {
        C2331g c2331g = (C2331g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int iM9903t = m9903t(c2331g.f7313a);
        if (iM9903t == 48) {
            return getPaddingTop() - i8;
        }
        if (iM9903t == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c2331g).bottomMargin) - i8;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i9 = ((ViewGroup.MarginLayoutParams) c2331g).topMargin;
        if (iMax < i9) {
            iMax = i9;
        } else {
            int i10 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i11 = ((ViewGroup.MarginLayoutParams) c2331g).bottomMargin;
            if (i10 < i11) {
                iMax = Math.max(0, iMax - (i11 - i10));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: t */
    private int m9903t(int i7) {
        int i8 = i7 & 112;
        return (i8 == 16 || i8 == 48 || i8 == 80) ? i8 : this.f8075H & 112;
    }

    /* JADX INFO: renamed from: u */
    private int m9904u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    /* JADX INFO: renamed from: v */
    private int m9905v(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: w */
    private int m9906w(List list, int[] iArr) {
        int i7 = iArr[0];
        int i8 = iArr[1];
        int size = list.size();
        int i9 = 0;
        int measuredWidth = 0;
        while (i9 < size) {
            View view = (View) list.get(i9);
            C2331g c2331g = (C2331g) view.getLayoutParams();
            int i10 = ((ViewGroup.MarginLayoutParams) c2331g).leftMargin - i7;
            int i11 = ((ViewGroup.MarginLayoutParams) c2331g).rightMargin - i8;
            int iMax = Math.max(0, i10);
            int iMax2 = Math.max(0, i11);
            int iMax3 = Math.max(0, -i10);
            int iMax4 = Math.max(0, -i11);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i9++;
            i8 = iMax4;
            i7 = iMax3;
        }
        return measuredWidth;
    }

    /* JADX INFO: renamed from: A */
    public void m9907A() {
        Iterator it = this.f8086S.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        m9890I();
    }

    /* JADX INFO: renamed from: C */
    public boolean m9908C() {
        ActionMenuView actionMenuView = this.f8091a;
        return actionMenuView != null && actionMenuView.m9669I();
    }

    /* JADX INFO: renamed from: D */
    public boolean m9909D() {
        ActionMenuView actionMenuView = this.f8091a;
        return actionMenuView != null && actionMenuView.m9670J();
    }

    /* JADX INFO: renamed from: K */
    void m9910K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C2331g) childAt.getLayoutParams()).f8121b != 2 && childAt != this.f8091a) {
                removeViewAt(childCount);
                this.f8083P.add(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m9911L(int i7, int i8) {
        m9896i();
        this.f8072E.m9983g(i7, i8);
    }

    /* JADX INFO: renamed from: M */
    public void m9912M(C2280e c2280e, C2345c c2345c) {
        if (c2280e == null && this.f8091a == null) {
            return;
        }
        m9899l();
        C2280e c2280eM9672N = this.f8091a.m9672N();
        if (c2280eM9672N == c2280e) {
            return;
        }
        if (c2280eM9672N != null) {
            c2280eM9672N.m9506R(this.f8090W);
            c2280eM9672N.m9506R(this.f8092a0);
        }
        if (this.f8092a0 == null) {
            this.f8092a0 = new C2330f();
        }
        c2345c.m10015I(true);
        if (c2280e != null) {
            c2280e.m9518c(c2345c, this.f8108u);
            c2280e.m9518c(this.f8092a0, this.f8108u);
        } else {
            c2345c.mo9437i(this.f8108u, null);
            this.f8092a0.mo9437i(this.f8108u, null);
            c2345c.mo9433d(true);
            this.f8092a0.mo9433d(true);
        }
        this.f8091a.setPopupTheme(this.f8109v);
        this.f8091a.setPresenter(c2345c);
        this.f8090W = c2345c;
        m9916S();
    }

    /* JADX INFO: renamed from: N */
    public void m9913N(Context context, int i7) {
        this.f8111x = i7;
        TextView textView = this.f8095c;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m9914O(Context context, int i7) {
        this.f8110w = i7;
        TextView textView = this.f8093b;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    /* JADX INFO: renamed from: R */
    public boolean m9915R() {
        ActionMenuView actionMenuView = this.f8091a;
        return actionMenuView != null && actionMenuView.m9674P();
    }

    /* JADX INFO: renamed from: S */
    void m9916S() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM9928a = C2329e.m9928a(this);
            boolean z7 = m9925x() && onBackInvokedDispatcherM9928a != null && isAttachedToWindow() && this.f8103g0;
            if (z7 && this.f8102f0 == null) {
                if (this.f8100e0 == null) {
                    this.f8100e0 = C2329e.m9929b(new Runnable() { // from class: androidx.appcompat.widget.e0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8227a.m9919f();
                        }
                    });
                }
                C2329e.m9930c(onBackInvokedDispatcherM9928a, this.f8100e0);
                this.f8102f0 = onBackInvokedDispatcherM9928a;
                return;
            }
            if (z7 || (onBackInvokedDispatcher = this.f8102f0) == null) {
                return;
            }
            C2329e.m9931d(onBackInvokedDispatcher, this.f8100e0);
            this.f8102f0 = null;
        }
    }

    /* JADX INFO: renamed from: a */
    void m9917a() {
        for (int size = this.f8083P.size() - 1; size >= 0; size--) {
            addView((View) this.f8083P.get(size));
        }
        this.f8083P.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2331g);
    }

    /* JADX INFO: renamed from: d */
    public boolean m9918d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f8091a) != null && actionMenuView.m9671K();
    }

    @Override // p111O.InterfaceC1080w
    /* JADX INFO: renamed from: e */
    public void mo4782e(InterfaceC1086z interfaceC1086z) {
        this.f8085R.m4790f(interfaceC1086z);
    }

    /* JADX INFO: renamed from: f */
    public void m9919f() {
        C2330f c2330f = this.f8092a0;
        C2282g c2282g = c2330f == null ? null : c2330f.f8119b;
        if (c2282g != null) {
            c2282g.collapseActionView();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m9920g() {
        ActionMenuView actionMenuView = this.f8091a;
        if (actionMenuView != null) {
            actionMenuView.m9662B();
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f8106s;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f8106s;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C2338X c2338x = this.f8072E;
        if (c2338x != null) {
            return c2338x.m9977a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.f8074G;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C2338X c2338x = this.f8072E;
        if (c2338x != null) {
            return c2338x.m9978b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C2338X c2338x = this.f8072E;
        if (c2338x != null) {
            return c2338x.m9979c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C2338X c2338x = this.f8072E;
        if (c2338x != null) {
            return c2338x.m9980d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.f8073F;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C2280e c2280eM9672N;
        ActionMenuView actionMenuView = this.f8091a;
        return (actionMenuView == null || (c2280eM9672N = actionMenuView.m9672N()) == null || !c2280eM9672N.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f8074G, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f8073F, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f8099e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f8099e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m9898k();
        return this.f8091a.getMenu();
    }

    View getNavButtonView() {
        return this.f8097d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f8097d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f8097d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C2345c getOuterActionMenuPresenter() {
        return this.f8090W;
    }

    public Drawable getOverflowIcon() {
        m9898k();
        return this.f8091a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f8108u;
    }

    public int getPopupTheme() {
        return this.f8109v;
    }

    public CharSequence getSubtitle() {
        return this.f8077J;
    }

    final TextView getSubtitleTextView() {
        return this.f8095c;
    }

    public CharSequence getTitle() {
        return this.f8076I;
    }

    public int getTitleMarginBottom() {
        return this.f8071D;
    }

    public int getTitleMarginEnd() {
        return this.f8069B;
    }

    public int getTitleMarginStart() {
        return this.f8068A;
    }

    public int getTitleMarginTop() {
        return this.f8070C;
    }

    final TextView getTitleTextView() {
        return this.f8093b;
    }

    public InterfaceC2310H getWrapper() {
        if (this.f8089V == null) {
            this.f8089V = new C2356h0(this, true);
        }
        return this.f8089V;
    }

    /* JADX INFO: renamed from: h */
    void m9921h() {
        if (this.f8106s == null) {
            C2366o c2366o = new C2366o(getContext(), null, AbstractC5520a.f20961L);
            this.f8106s = c2366o;
            c2366o.setImageDrawable(this.f8101f);
            this.f8106s.setContentDescription(this.f8105r);
            C2331g c2331gGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c2331gGenerateDefaultLayoutParams.f7313a = (this.f8112y & 112) | 8388611;
            c2331gGenerateDefaultLayoutParams.f8121b = 2;
            this.f8106s.setLayoutParams(c2331gGenerateDefaultLayoutParams);
            this.f8106s.setOnClickListener(new ViewOnClickListenerC2328d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C2331g generateDefaultLayoutParams() {
        return new C2331g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C2331g generateLayoutParams(AttributeSet attributeSet) {
        return new C2331g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9916S();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f8104h0);
        m9916S();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8081N = false;
        }
        if (!this.f8081N) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f8081N = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8081N = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0281  */
    /* JADX WARN: Code duplicated, block: B:102:0x0284  */
    /* JADX WARN: Code duplicated, block: B:105:0x0298 A[LOOP:0: B:104:0x0296->B:105:0x0298, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b6 A[LOOP:1: B:107:0x02b4->B:108:0x02b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ed A[LOOP:2: B:116:0x02eb->B:117:0x02ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:90:0x021e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0220  */
    /* JADX WARN: Code duplicated, block: B:93:0x0225  */
    /* JADX WARN: Code duplicated, block: B:96:0x0239  */
    /* JADX WARN: Code duplicated, block: B:97:0x025c  */
    /* JADX WARN: Code duplicated, block: B:99:0x025f  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int iM9886E;
        int iM9887F;
        int iMax;
        int iMin;
        boolean zM9893Q;
        boolean zM9893Q2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        C2331g c2331g;
        C2331g c2331g2;
        int i11;
        boolean z8;
        int i12;
        int i13;
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iMax2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int size;
        int iM9886E2;
        int i26;
        int size2;
        int i27;
        int i28;
        int i29;
        int size3;
        boolean z9 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i30 = width - paddingRight;
        int[] iArr = this.f8084Q;
        iArr[1] = 0;
        iArr[0] = 0;
        int iM4425A = AbstractC1030Z.m4425A(this);
        int iMin2 = iM4425A >= 0 ? Math.min(iM4425A, i10 - i8) : 0;
        if (m9893Q(this.f8097d)) {
            if (z9) {
                iM9887F = m9887F(this.f8097d, i30, iArr, iMin2);
                iM9886E = paddingLeft;
            } else {
                iM9886E = m9886E(this.f8097d, paddingLeft, iArr, iMin2);
            }
            if (m9893Q(this.f8106s)) {
                if (z9) {
                    iM9887F = m9887F(this.f8106s, iM9887F, iArr, iMin2);
                } else {
                    iM9886E = m9886E(this.f8106s, iM9886E, iArr, iMin2);
                }
            }
            if (m9893Q(this.f8091a)) {
                if (z9) {
                    iM9886E = m9886E(this.f8091a, iM9886E, iArr, iMin2);
                } else {
                    iM9887F = m9887F(this.f8091a, iM9887F, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM9886E);
            iArr[1] = Math.max(0, currentContentInsetRight - (i30 - iM9887F));
            iMax = Math.max(iM9886E, currentContentInsetLeft);
            iMin = Math.min(iM9887F, i30 - currentContentInsetRight);
            if (m9893Q(this.f8107t)) {
                if (z9) {
                    iMin = m9887F(this.f8107t, iMin, iArr, iMin2);
                } else {
                    iMax = m9886E(this.f8107t, iMax, iArr, iMin2);
                }
            }
            if (m9893Q(this.f8099e)) {
                if (z9) {
                    iMin = m9887F(this.f8099e, iMin, iArr, iMin2);
                } else {
                    iMax = m9886E(this.f8099e, iMax, iArr, iMin2);
                }
            }
            zM9893Q = m9893Q(this.f8093b);
            zM9893Q2 = m9893Q(this.f8095c);
            if (zM9893Q) {
                C2331g c2331g3 = (C2331g) this.f8093b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) c2331g3).bottomMargin + ((ViewGroup.MarginLayoutParams) c2331g3).topMargin + this.f8093b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zM9893Q2) {
                C2331g c2331g4 = (C2331g) this.f8095c.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) c2331g4).topMargin + this.f8095c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2331g4).bottomMargin;
            }
            if (!zM9893Q || zM9893Q2) {
                if (zM9893Q) {
                    textView = this.f8093b;
                } else {
                    textView = this.f8095c;
                }
                if (zM9893Q2) {
                    textView2 = this.f8095c;
                } else {
                    textView2 = this.f8093b;
                }
                c2331g = (C2331g) textView.getLayoutParams();
                c2331g2 = (C2331g) textView2.getLayoutParams();
                i11 = measuredHeight;
                z8 = (!zM9893Q && this.f8093b.getMeasuredWidth() > 0) || (zM9893Q2 && this.f8095c.getMeasuredWidth() > 0);
                i12 = this.f8075H & 112;
                i13 = iMax;
                if (i12 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2331g).topMargin + this.f8070C;
                } else if (i12 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i11) / 2;
                    i21 = ((ViewGroup.MarginLayoutParams) c2331g).topMargin;
                    i22 = this.f8070C;
                    if (iMax2 < i21 + i22) {
                        iMax2 = i21 + i22;
                    } else {
                        i23 = (((height - paddingBottom) - i11) - iMax2) - paddingTop2;
                        i24 = ((ViewGroup.MarginLayoutParams) c2331g).bottomMargin;
                        i25 = this.f8071D;
                        if (i23 < i24 + i25) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c2331g2).bottomMargin + i25) - i23));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c2331g2).bottomMargin) - this.f8071D) - i11;
                }
                if (z9) {
                    if (z8) {
                        i18 = this.f8068A;
                    } else {
                        i18 = 0;
                    }
                    int i31 = i18 - iArr[1];
                    iMin -= Math.max(0, i31);
                    iArr[1] = Math.max(0, -i31);
                    if (zM9893Q) {
                        C2331g c2331g5 = (C2331g) this.f8093b.getLayoutParams();
                        int measuredWidth = iMin - this.f8093b.getMeasuredWidth();
                        int measuredHeight2 = this.f8093b.getMeasuredHeight() + paddingTop;
                        this.f8093b.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i19 = measuredWidth - this.f8069B;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c2331g5).bottomMargin;
                    } else {
                        i19 = iMin;
                    }
                    if (zM9893Q2) {
                        int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C2331g) this.f8095c.getLayoutParams())).topMargin;
                        this.f8095c.layout(iMin - this.f8095c.getMeasuredWidth(), i32, iMin, this.f8095c.getMeasuredHeight() + i32);
                        i20 = iMin - this.f8069B;
                    } else {
                        i20 = iMin;
                    }
                    if (z8) {
                        iMin = Math.min(i19, i20);
                    }
                    iMax = i13;
                    i15 = 0;
                } else {
                    if (z8) {
                        i14 = this.f8068A;
                    } else {
                        i14 = 0;
                    }
                    i15 = 0;
                    int i33 = i14 - iArr[0];
                    iMax = i13 + Math.max(0, i33);
                    iArr[0] = Math.max(0, -i33);
                    if (zM9893Q) {
                        C2331g c2331g6 = (C2331g) this.f8093b.getLayoutParams();
                        int measuredWidth2 = this.f8093b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f8093b.getMeasuredHeight() + paddingTop;
                        this.f8093b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i16 = measuredWidth2 + this.f8069B;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c2331g6).bottomMargin;
                    } else {
                        i16 = iMax;
                    }
                    if (zM9893Q2) {
                        int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C2331g) this.f8095c.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f8095c.getMeasuredWidth() + iMax;
                        this.f8095c.layout(iMax, i34, measuredWidth3, this.f8095c.getMeasuredHeight() + i34);
                        i17 = measuredWidth3 + this.f8069B;
                    } else {
                        i17 = iMax;
                    }
                    if (z8) {
                        iMax = Math.max(i16, i17);
                    }
                }
            } else {
                i15 = 0;
            }
            m9894b(this.f8082O, 3);
            size = this.f8082O.size();
            iM9886E2 = iMax;
            for (i26 = i15; i26 < size; i26++) {
                iM9886E2 = m9886E((View) this.f8082O.get(i26), iM9886E2, iArr, iMin2);
            }
            m9894b(this.f8082O, 5);
            size2 = this.f8082O.size();
            for (i27 = i15; i27 < size2; i27++) {
                iMin = m9887F((View) this.f8082O.get(i27), iMin, iArr, iMin2);
            }
            m9894b(this.f8082O, 1);
            int iM9906w = m9906w(this.f8082O, iArr);
            i28 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iM9906w / 2);
            i29 = iM9906w + i28;
            if (i28 >= iM9886E2) {
                if (i29 > iMin) {
                    iM9886E2 = i28 - (i29 - iMin);
                } else {
                    iM9886E2 = i28;
                }
            }
            size3 = this.f8082O.size();
            while (i15 < size3) {
                iM9886E2 = m9886E((View) this.f8082O.get(i15), iM9886E2, iArr, iMin2);
                i15++;
            }
            this.f8082O.clear();
        }
        iM9886E = paddingLeft;
        iM9887F = i30;
        if (m9893Q(this.f8106s)) {
            if (z9) {
                iM9887F = m9887F(this.f8106s, iM9887F, iArr, iMin2);
            } else {
                iM9886E = m9886E(this.f8106s, iM9886E, iArr, iMin2);
            }
        }
        if (m9893Q(this.f8091a)) {
            if (z9) {
                iM9886E = m9886E(this.f8091a, iM9886E, iArr, iMin2);
            } else {
                iM9887F = m9887F(this.f8091a, iM9887F, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM9886E);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i30 - iM9887F));
        iMax = Math.max(iM9886E, currentContentInsetLeft2);
        iMin = Math.min(iM9887F, i30 - currentContentInsetRight2);
        if (m9893Q(this.f8107t)) {
            if (z9) {
                iMin = m9887F(this.f8107t, iMin, iArr, iMin2);
            } else {
                iMax = m9886E(this.f8107t, iMax, iArr, iMin2);
            }
        }
        if (m9893Q(this.f8099e)) {
            if (z9) {
                iMin = m9887F(this.f8099e, iMin, iArr, iMin2);
            } else {
                iMax = m9886E(this.f8099e, iMax, iArr, iMin2);
            }
        }
        zM9893Q = m9893Q(this.f8093b);
        zM9893Q2 = m9893Q(this.f8095c);
        if (zM9893Q) {
            C2331g c2331g7 = (C2331g) this.f8093b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) c2331g7).bottomMargin + ((ViewGroup.MarginLayoutParams) c2331g7).topMargin + this.f8093b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zM9893Q2) {
            C2331g c2331g8 = (C2331g) this.f8095c.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) c2331g8).topMargin + this.f8095c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c2331g8).bottomMargin;
        }
        if (zM9893Q) {
            if (zM9893Q) {
                textView = this.f8093b;
            } else {
                textView = this.f8095c;
            }
            if (zM9893Q2) {
                textView2 = this.f8095c;
            } else {
                textView2 = this.f8093b;
            }
            c2331g = (C2331g) textView.getLayoutParams();
            c2331g2 = (C2331g) textView2.getLayoutParams();
            i11 = measuredHeight;
            if (zM9893Q) {
            }
            i12 = this.f8075H & 112;
            i13 = iMax;
            if (i12 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2331g).topMargin + this.f8070C;
            } else if (i12 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i11) / 2;
                i21 = ((ViewGroup.MarginLayoutParams) c2331g).topMargin;
                i22 = this.f8070C;
                if (iMax2 < i21 + i22) {
                    iMax2 = i21 + i22;
                } else {
                    i23 = (((height - paddingBottom) - i11) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) c2331g).bottomMargin;
                    i25 = this.f8071D;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c2331g2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c2331g2).bottomMargin) - this.f8071D) - i11;
            }
            if (z9) {
                if (z8) {
                    i18 = this.f8068A;
                } else {
                    i18 = 0;
                }
                int i35 = i18 - iArr[1];
                iMin -= Math.max(0, i35);
                iArr[1] = Math.max(0, -i35);
                if (zM9893Q) {
                    C2331g c2331g9 = (C2331g) this.f8093b.getLayoutParams();
                    int measuredWidth4 = iMin - this.f8093b.getMeasuredWidth();
                    int measuredHeight4 = this.f8093b.getMeasuredHeight() + paddingTop;
                    this.f8093b.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i19 = measuredWidth4 - this.f8069B;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c2331g9).bottomMargin;
                } else {
                    i19 = iMin;
                }
                if (zM9893Q2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C2331g) this.f8095c.getLayoutParams())).topMargin;
                    this.f8095c.layout(iMin - this.f8095c.getMeasuredWidth(), i36, iMin, this.f8095c.getMeasuredHeight() + i36);
                    i20 = iMin - this.f8069B;
                } else {
                    i20 = iMin;
                }
                if (z8) {
                    iMin = Math.min(i19, i20);
                }
                iMax = i13;
                i15 = 0;
            } else {
                if (z8) {
                    i14 = this.f8068A;
                } else {
                    i14 = 0;
                }
                i15 = 0;
                int i37 = i14 - iArr[0];
                iMax = i13 + Math.max(0, i37);
                iArr[0] = Math.max(0, -i37);
                if (zM9893Q) {
                    C2331g c2331g10 = (C2331g) this.f8093b.getLayoutParams();
                    int measuredWidth5 = this.f8093b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f8093b.getMeasuredHeight() + paddingTop;
                    this.f8093b.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i16 = measuredWidth5 + this.f8069B;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c2331g10).bottomMargin;
                } else {
                    i16 = iMax;
                }
                if (zM9893Q2) {
                    int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C2331g) this.f8095c.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f8095c.getMeasuredWidth() + iMax;
                    this.f8095c.layout(iMax, i38, measuredWidth6, this.f8095c.getMeasuredHeight() + i38);
                    i17 = measuredWidth6 + this.f8069B;
                } else {
                    i17 = iMax;
                }
                if (z8) {
                    iMax = Math.max(i16, i17);
                }
            }
        } else {
            if (zM9893Q) {
                textView = this.f8093b;
            } else {
                textView = this.f8095c;
            }
            if (zM9893Q2) {
                textView2 = this.f8095c;
            } else {
                textView2 = this.f8093b;
            }
            c2331g = (C2331g) textView.getLayoutParams();
            c2331g2 = (C2331g) textView2.getLayoutParams();
            i11 = measuredHeight;
            if (zM9893Q) {
            }
            i12 = this.f8075H & 112;
            i13 = iMax;
            if (i12 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2331g).topMargin + this.f8070C;
            } else if (i12 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i11) / 2;
                i21 = ((ViewGroup.MarginLayoutParams) c2331g).topMargin;
                i22 = this.f8070C;
                if (iMax2 < i21 + i22) {
                    iMax2 = i21 + i22;
                } else {
                    i23 = (((height - paddingBottom) - i11) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) c2331g).bottomMargin;
                    i25 = this.f8071D;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c2331g2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c2331g2).bottomMargin) - this.f8071D) - i11;
            }
            if (z9) {
                if (z8) {
                    i18 = this.f8068A;
                } else {
                    i18 = 0;
                }
                int i39 = i18 - iArr[1];
                iMin -= Math.max(0, i39);
                iArr[1] = Math.max(0, -i39);
                if (zM9893Q) {
                    C2331g c2331g11 = (C2331g) this.f8093b.getLayoutParams();
                    int measuredWidth7 = iMin - this.f8093b.getMeasuredWidth();
                    int measuredHeight6 = this.f8093b.getMeasuredHeight() + paddingTop;
                    this.f8093b.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i19 = measuredWidth7 - this.f8069B;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c2331g11).bottomMargin;
                } else {
                    i19 = iMin;
                }
                if (zM9893Q2) {
                    int i310 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C2331g) this.f8095c.getLayoutParams())).topMargin;
                    this.f8095c.layout(iMin - this.f8095c.getMeasuredWidth(), i310, iMin, this.f8095c.getMeasuredHeight() + i310);
                    i20 = iMin - this.f8069B;
                } else {
                    i20 = iMin;
                }
                if (z8) {
                    iMin = Math.min(i19, i20);
                }
                iMax = i13;
                i15 = 0;
            } else {
                if (z8) {
                    i14 = this.f8068A;
                } else {
                    i14 = 0;
                }
                i15 = 0;
                int i311 = i14 - iArr[0];
                iMax = i13 + Math.max(0, i311);
                iArr[0] = Math.max(0, -i311);
                if (zM9893Q) {
                    C2331g c2331g12 = (C2331g) this.f8093b.getLayoutParams();
                    int measuredWidth8 = this.f8093b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f8093b.getMeasuredHeight() + paddingTop;
                    this.f8093b.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i16 = measuredWidth8 + this.f8069B;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c2331g12).bottomMargin;
                } else {
                    i16 = iMax;
                }
                if (zM9893Q2) {
                    int i312 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C2331g) this.f8095c.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f8095c.getMeasuredWidth() + iMax;
                    this.f8095c.layout(iMax, i312, measuredWidth9, this.f8095c.getMeasuredHeight() + i312);
                    i17 = measuredWidth9 + this.f8069B;
                } else {
                    i17 = iMax;
                }
                if (z8) {
                    iMax = Math.max(i16, i17);
                }
            }
        }
        m9894b(this.f8082O, 3);
        size = this.f8082O.size();
        iM9886E2 = iMax;
        while (i26 < size) {
            iM9886E2 = m9886E((View) this.f8082O.get(i26), iM9886E2, iArr, iMin2);
        }
        m9894b(this.f8082O, 5);
        size2 = this.f8082O.size();
        while (i27 < size2) {
            iMin = m9887F((View) this.f8082O.get(i27), iMin, iArr, iMin2);
        }
        m9894b(this.f8082O, 1);
        int iM9906w2 = m9906w(this.f8082O, iArr);
        i28 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iM9906w2 / 2);
        i29 = iM9906w2 + i28;
        if (i28 >= iM9886E2) {
            if (i29 > iMin) {
                iM9886E2 = i28 - (i29 - iMin);
            } else {
                iM9886E2 = i28;
            }
        }
        size3 = this.f8082O.size();
        while (i15 < size3) {
            iM9886E2 = m9886E((View) this.f8082O.get(i15), iM9886E2, iArr, iMin2);
            i15++;
        }
        this.f8082O.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.f8084Q;
        boolean zM10112b = AbstractC2362k0.m10112b(this);
        int i9 = !zM10112b ? 1 : 0;
        if (m9893Q(this.f8097d)) {
            m9889H(this.f8097d, i7, 0, i8, 0, this.f8113z);
            measuredWidth = this.f8097d.getMeasuredWidth() + m9904u(this.f8097d);
            iMax = Math.max(0, this.f8097d.getMeasuredHeight() + m9905v(this.f8097d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f8097d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m9893Q(this.f8106s)) {
            m9889H(this.f8106s, i7, 0, i8, 0, this.f8113z);
            measuredWidth = this.f8106s.getMeasuredWidth() + m9904u(this.f8106s);
            iMax = Math.max(iMax, this.f8106s.getMeasuredHeight() + m9905v(this.f8106s));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8106s.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zM10112b ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (m9893Q(this.f8091a)) {
            m9889H(this.f8091a, i7, iMax3, i8, 0, this.f8113z);
            measuredWidth2 = this.f8091a.getMeasuredWidth() + m9904u(this.f8091a);
            iMax = Math.max(iMax, this.f8091a.getMeasuredHeight() + m9905v(this.f8091a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8091a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i9] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (m9893Q(this.f8107t)) {
            iArr = iArr2;
            iMax4 += m9888G(this.f8107t, i7, iMax4, i8, 0, iArr);
            iMax = Math.max(iMax, this.f8107t.getMeasuredHeight() + m9905v(this.f8107t));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8107t.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (m9893Q(this.f8099e)) {
            iMax4 += m9888G(this.f8099e, i7, iMax4, i8, 0, iArr);
            iMax = Math.max(iMax, this.f8099e.getMeasuredHeight() + m9905v(this.f8099e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8099e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((C2331g) childAt.getLayoutParams()).f8121b == 0 && m9893Q(childAt)) {
                iMax4 += m9888G(childAt, i7, iMax4, i8, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + m9905v(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i11 = iMax4;
        int i12 = this.f8070C + this.f8071D;
        int i13 = this.f8068A + this.f8069B;
        if (m9893Q(this.f8093b)) {
            m9888G(this.f8093b, i7, i11 + i13, i8, i12, iArr);
            int measuredWidth3 = this.f8093b.getMeasuredWidth() + m9904u(this.f8093b);
            int measuredHeight2 = this.f8093b.getMeasuredHeight() + m9905v(this.f8093b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f8093b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (m9893Q(this.f8095c)) {
            iMax2 = Math.max(iMax2, m9888G(this.f8095c, i7, i11 + i13, i8, i12 + measuredHeight, iArr));
            measuredHeight += this.f8095c.getMeasuredHeight() + m9905v(this.f8095c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f8095c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i11 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, (-16777216) & iCombineMeasuredStates2), m9892P() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C2333i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2333i c2333i = (C2333i) parcelable;
        super.onRestoreInstanceState(c2333i.m6085a());
        ActionMenuView actionMenuView = this.f8091a;
        C2280e c2280eM9672N = actionMenuView != null ? actionMenuView.m9672N() : null;
        int i7 = c2333i.f8122c;
        if (i7 != 0 && this.f8092a0 != null && c2280eM9672N != null && (menuItemFindItem = c2280eM9672N.findItem(i7)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c2333i.f8123d) {
            m9891J();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        m9896i();
        this.f8072E.m9982f(i7 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C2282g c2282g;
        C2333i c2333i = new C2333i(super.onSaveInstanceState());
        C2330f c2330f = this.f8092a0;
        if (c2330f != null && (c2282g = c2330f.f8119b) != null) {
            c2333i.f8122c = c2282g.getItemId();
        }
        c2333i.f8123d = m9909D();
        return c2333i;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8080M = false;
        }
        if (!this.f8080M) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f8080M = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8080M = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C2331g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C2331g) {
            return new C2331g((C2331g) layoutParams);
        }
        if (layoutParams instanceof AbstractC2240a.a) {
            return new C2331g((AbstractC2240a.a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2331g((ViewGroup.MarginLayoutParams) layoutParams) : new C2331g(layoutParams);
    }

    @Override // p111O.InterfaceC1080w
    /* JADX INFO: renamed from: s */
    public void mo4783s(InterfaceC1086z interfaceC1086z) {
        this.f8085R.m4785a(interfaceC1086z);
    }

    public void setBackInvokedCallbackEnabled(boolean z7) {
        if (this.f8103g0 != z7) {
            this.f8103g0 = z7;
            m9916S();
        }
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(AbstractC5659a.m25175b(getContext(), i7));
    }

    public void setCollapsible(boolean z7) {
        this.f8098d0 = z7;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f8074G) {
            this.f8074G = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f8073F) {
            this.f8073F = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(AbstractC5659a.m25175b(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(AbstractC5659a.m25175b(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m9900m();
        this.f8097d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC2332h interfaceC2332h) {
        this.f8087T = interfaceC2332h;
    }

    public void setOverflowIcon(Drawable drawable) {
        m9898k();
        this.f8091a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.f8109v != i7) {
            this.f8109v = i7;
            if (i7 == 0) {
                this.f8108u = getContext();
            } else {
                this.f8108u = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMarginBottom(int i7) {
        this.f8071D = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.f8069B = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.f8068A = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.f8070C = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    /* JADX INFO: renamed from: x */
    public boolean m9925x() {
        C2330f c2330f = this.f8092a0;
        return (c2330f == null || c2330f.f8119b == null) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public boolean m9926y() {
        ActionMenuView actionMenuView = this.f8091a;
        return actionMenuView != null && actionMenuView.m9668H();
    }

    /* JADX INFO: renamed from: z */
    public void m9927z(int i7) {
        getMenuInflater().inflate(i7, getMenu());
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C2331g extends AbstractC2240a.a {

        /* JADX INFO: renamed from: b */
        int f8121b;

        public C2331g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8121b = 0;
        }

        /* JADX INFO: renamed from: a */
        void m9932a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C2331g(int i7, int i8) {
            super(i7, i8);
            this.f8121b = 0;
            this.f7313a = 8388627;
        }

        public C2331g(C2331g c2331g) {
            super((AbstractC2240a.a) c2331g);
            this.f8121b = 0;
            this.f8121b = c2331g.f8121b;
        }

        public C2331g(AbstractC2240a.a aVar) {
            super(aVar);
            this.f8121b = 0;
        }

        public C2331g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8121b = 0;
            m9932a(marginLayoutParams);
        }

        public C2331g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8121b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8075H = 8388627;
        this.f8082O = new ArrayList();
        this.f8083P = new ArrayList();
        this.f8084Q = new int[2];
        this.f8085R = new C1082x(new Runnable() { // from class: androidx.appcompat.widget.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8232a.m9907A();
            }
        });
        this.f8086S = new ArrayList();
        this.f8088U = new C2325a();
        this.f8104h0 = new RunnableC2326b();
        Context context2 = getContext();
        int[] iArr = AbstractC5529j.f21196S2;
        C2348d0 c2348d0M10025v = C2348d0.m10025v(context2, attributeSet, iArr, i7, 0);
        AbstractC1030Z.m4470h0(this, context, iArr, attributeSet, c2348d0M10025v.m10043r(), i7, 0);
        this.f8110w = c2348d0M10025v.m10039n(AbstractC5529j.f21329u3, 0);
        this.f8111x = c2348d0M10025v.m10039n(AbstractC5529j.f21284l3, 0);
        this.f8075H = c2348d0M10025v.m10037l(AbstractC5529j.f21200T2, this.f8075H);
        this.f8112y = c2348d0M10025v.m10037l(AbstractC5529j.f21204U2, 48);
        int iM10030e = c2348d0M10025v.m10030e(AbstractC5529j.f21299o3, 0);
        int i8 = AbstractC5529j.f21324t3;
        iM10030e = c2348d0M10025v.m10044s(i8) ? c2348d0M10025v.m10030e(i8, iM10030e) : iM10030e;
        this.f8071D = iM10030e;
        this.f8070C = iM10030e;
        this.f8069B = iM10030e;
        this.f8068A = iM10030e;
        int iM10030e2 = c2348d0M10025v.m10030e(AbstractC5529j.f21314r3, -1);
        if (iM10030e2 >= 0) {
            this.f8068A = iM10030e2;
        }
        int iM10030e3 = c2348d0M10025v.m10030e(AbstractC5529j.f21309q3, -1);
        if (iM10030e3 >= 0) {
            this.f8069B = iM10030e3;
        }
        int iM10030e4 = c2348d0M10025v.m10030e(AbstractC5529j.f21319s3, -1);
        if (iM10030e4 >= 0) {
            this.f8070C = iM10030e4;
        }
        int iM10030e5 = c2348d0M10025v.m10030e(AbstractC5529j.f21304p3, -1);
        if (iM10030e5 >= 0) {
            this.f8071D = iM10030e5;
        }
        this.f8113z = c2348d0M10025v.m10031f(AbstractC5529j.f21254f3, -1);
        int iM10030e6 = c2348d0M10025v.m10030e(AbstractC5529j.f21234b3, Integer.MIN_VALUE);
        int iM10030e7 = c2348d0M10025v.m10030e(AbstractC5529j.f21216X2, Integer.MIN_VALUE);
        int iM10031f = c2348d0M10025v.m10031f(AbstractC5529j.f21224Z2, 0);
        int iM10031f2 = c2348d0M10025v.m10031f(AbstractC5529j.f21229a3, 0);
        m9896i();
        this.f8072E.m9981e(iM10031f, iM10031f2);
        if (iM10030e6 != Integer.MIN_VALUE || iM10030e7 != Integer.MIN_VALUE) {
            this.f8072E.m9983g(iM10030e6, iM10030e7);
        }
        this.f8073F = c2348d0M10025v.m10030e(AbstractC5529j.f21239c3, Integer.MIN_VALUE);
        this.f8074G = c2348d0M10025v.m10030e(AbstractC5529j.f21220Y2, Integer.MIN_VALUE);
        this.f8101f = c2348d0M10025v.m10032g(AbstractC5529j.f21212W2);
        this.f8105r = c2348d0M10025v.m10041p(AbstractC5529j.f21208V2);
        CharSequence charSequenceM10041p = c2348d0M10025v.m10041p(AbstractC5529j.f21294n3);
        if (!TextUtils.isEmpty(charSequenceM10041p)) {
            setTitle(charSequenceM10041p);
        }
        CharSequence charSequenceM10041p2 = c2348d0M10025v.m10041p(AbstractC5529j.f21279k3);
        if (!TextUtils.isEmpty(charSequenceM10041p2)) {
            setSubtitle(charSequenceM10041p2);
        }
        this.f8108u = getContext();
        setPopupTheme(c2348d0M10025v.m10039n(AbstractC5529j.f21274j3, 0));
        Drawable drawableM10032g = c2348d0M10025v.m10032g(AbstractC5529j.f21269i3);
        if (drawableM10032g != null) {
            setNavigationIcon(drawableM10032g);
        }
        CharSequence charSequenceM10041p3 = c2348d0M10025v.m10041p(AbstractC5529j.f21264h3);
        if (!TextUtils.isEmpty(charSequenceM10041p3)) {
            setNavigationContentDescription(charSequenceM10041p3);
        }
        Drawable drawableM10032g2 = c2348d0M10025v.m10032g(AbstractC5529j.f21244d3);
        if (drawableM10032g2 != null) {
            setLogo(drawableM10032g2);
        }
        CharSequence charSequenceM10041p4 = c2348d0M10025v.m10041p(AbstractC5529j.f21249e3);
        if (!TextUtils.isEmpty(charSequenceM10041p4)) {
            setLogoDescription(charSequenceM10041p4);
        }
        int i9 = AbstractC5529j.f21334v3;
        if (c2348d0M10025v.m10044s(i9)) {
            setTitleTextColor(c2348d0M10025v.m10028c(i9));
        }
        int i10 = AbstractC5529j.f21289m3;
        if (c2348d0M10025v.m10044s(i10)) {
            setSubtitleTextColor(c2348d0M10025v.m10028c(i10));
        }
        int i11 = AbstractC5529j.f21259g3;
        if (c2348d0M10025v.m10044s(i11)) {
            m9927z(c2348d0M10025v.m10039n(i11, 0));
        }
        c2348d0M10025v.m10046x();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m9921h();
        }
        ImageButton imageButton = this.f8106s;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m9921h();
            this.f8106s.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f8106s;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f8101f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m9897j();
            if (!m9885B(this.f8099e)) {
                m9895c(this.f8099e, true);
            }
        } else {
            ImageView imageView = this.f8099e;
            if (imageView != null && m9885B(imageView)) {
                removeView(this.f8099e);
                this.f8083P.remove(this.f8099e);
            }
        }
        ImageView imageView2 = this.f8099e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m9897j();
        }
        ImageView imageView = this.f8099e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m9900m();
        }
        ImageButton imageButton = this.f8097d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            AbstractC2358i0.m10085a(this.f8097d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m9900m();
            if (!m9885B(this.f8097d)) {
                m9895c(this.f8097d, true);
            }
        } else {
            ImageButton imageButton = this.f8097d;
            if (imageButton != null && m9885B(imageButton)) {
                removeView(this.f8097d);
                this.f8083P.remove(this.f8097d);
            }
        }
        ImageButton imageButton2 = this.f8097d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f8095c;
            if (textView != null && m9885B(textView)) {
                removeView(this.f8095c);
                this.f8083P.remove(this.f8095c);
            }
        } else {
            if (this.f8095c == null) {
                Context context = getContext();
                C2303B c2303b = new C2303B(context);
                this.f8095c = c2303b;
                c2303b.setSingleLine();
                this.f8095c.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f8111x;
                if (i7 != 0) {
                    this.f8095c.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f8079L;
                if (colorStateList != null) {
                    this.f8095c.setTextColor(colorStateList);
                }
            }
            if (!m9885B(this.f8095c)) {
                m9895c(this.f8095c, true);
            }
        }
        TextView textView2 = this.f8095c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f8077J = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f8079L = colorStateList;
        TextView textView = this.f8095c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f8093b;
            if (textView != null && m9885B(textView)) {
                removeView(this.f8093b);
                this.f8083P.remove(this.f8093b);
            }
        } else {
            if (this.f8093b == null) {
                Context context = getContext();
                C2303B c2303b = new C2303B(context);
                this.f8093b = c2303b;
                c2303b.setSingleLine();
                this.f8093b.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f8110w;
                if (i7 != 0) {
                    this.f8093b.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f8078K;
                if (colorStateList != null) {
                    this.f8093b.setTextColor(colorStateList);
                }
            }
            if (!m9885B(this.f8093b)) {
                m9895c(this.f8093b, true);
            }
        }
        TextView textView2 = this.f8093b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f8076I = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f8078K = colorStateList;
        TextView textView = this.f8093b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$i */
    public static class C2333i extends AbstractC1446a {
        public static final Parcelable.Creator<C2333i> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        int f8122c;

        /* JADX INFO: renamed from: d */
        boolean f8123d;

        /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$i$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C2333i createFromParcel(Parcel parcel) {
                return new C2333i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2333i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2333i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C2333i[] newArray(int i7) {
                return new C2333i[i7];
            }
        }

        public C2333i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8122c = parcel.readInt();
            this.f8123d = parcel.readInt() != 0;
        }

        @Override // p146T.AbstractC1446a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f8122c);
            parcel.writeInt(this.f8123d ? 1 : 0);
        }

        public C2333i(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
