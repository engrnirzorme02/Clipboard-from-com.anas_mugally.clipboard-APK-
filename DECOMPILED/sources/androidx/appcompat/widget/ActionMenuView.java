package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C2280e;
import androidx.appcompat.view.menu.C2282g;
import androidx.appcompat.view.menu.InterfaceC2285j;
import androidx.appcompat.view.menu.InterfaceC2286k;
import com.google.android.gms.common.api.C3553a;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC2319Q implements C2280e.b, InterfaceC2286k {

    /* JADX INFO: renamed from: A */
    private C2280e f7856A;

    /* JADX INFO: renamed from: B */
    private Context f7857B;

    /* JADX INFO: renamed from: C */
    private int f7858C;

    /* JADX INFO: renamed from: D */
    private boolean f7859D;

    /* JADX INFO: renamed from: E */
    private C2345c f7860E;

    /* JADX INFO: renamed from: F */
    private InterfaceC2285j.a f7861F;

    /* JADX INFO: renamed from: G */
    C2280e.a f7862G;

    /* JADX INFO: renamed from: H */
    private boolean f7863H;

    /* JADX INFO: renamed from: I */
    private int f7864I;

    /* JADX INFO: renamed from: J */
    private int f7865J;

    /* JADX INFO: renamed from: K */
    private int f7866K;

    /* JADX INFO: renamed from: L */
    InterfaceC2302e f7867L;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC2298a {
        /* JADX INFO: renamed from: a */
        boolean mo9414a();

        /* JADX INFO: renamed from: b */
        boolean mo9415b();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C2299b implements InterfaceC2285j.a {
        C2299b() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j.a
        /* JADX INFO: renamed from: c */
        public void mo9249c(C2280e c2280e, boolean z7) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j.a
        /* JADX INFO: renamed from: d */
        public boolean mo9250d(C2280e c2280e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C2300c extends AbstractC2319Q.a {

        /* JADX INFO: renamed from: a */
        public boolean f7868a;

        /* JADX INFO: renamed from: b */
        public int f7869b;

        /* JADX INFO: renamed from: c */
        public int f7870c;

        /* JADX INFO: renamed from: d */
        public boolean f7871d;

        /* JADX INFO: renamed from: e */
        public boolean f7872e;

        /* JADX INFO: renamed from: f */
        boolean f7873f;

        public C2300c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C2300c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C2300c(C2300c c2300c) {
            super((ViewGroup.LayoutParams) c2300c);
            this.f7868a = c2300c.f7868a;
        }

        public C2300c(int i7, int i8) {
            super(i7, i8);
            this.f7868a = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C2301d implements C2280e.a {
        C2301d() {
        }

        @Override // androidx.appcompat.view.menu.C2280e.a
        /* JADX INFO: renamed from: a */
        public boolean mo9231a(C2280e c2280e, MenuItem menuItem) {
            InterfaceC2302e interfaceC2302e = ActionMenuView.this.f7867L;
            return interfaceC2302e != null && interfaceC2302e.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C2280e.a
        /* JADX INFO: renamed from: b */
        public void mo9233b(C2280e c2280e) {
            C2280e.a aVar = ActionMenuView.this.f7862G;
            if (aVar != null) {
                aVar.mo9233b(c2280e);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface InterfaceC2302e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX INFO: renamed from: L */
    static int m9660L(View view, int i7, int i8, int i9, int i10) {
        int i11;
        C2300c c2300c = (C2300c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9) - i10, View.MeasureSpec.getMode(i9));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z7 = false;
        boolean z8 = actionMenuItemView != null && actionMenuItemView.m9418s();
        if (i8 > 0) {
            i11 = 2;
            if (!z8 || i8 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i12 = measuredWidth / i7;
                if (measuredWidth % i7 != 0) {
                    i12++;
                }
                if (!z8 || i12 >= 2) {
                    i11 = i12;
                }
            } else {
                i11 = 0;
            }
        } else {
            i11 = 0;
        }
        if (!c2300c.f7868a && z8) {
            z7 = true;
        }
        c2300c.f7871d = z7;
        c2300c.f7869b = i11;
        view.measure(View.MeasureSpec.makeMeasureSpec(i7 * i11, 1073741824), iMakeMeasureSpec);
        return i11;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX INFO: renamed from: M */
    private void m9661M(int i7, int i8) {
        long j7;
        int i9;
        boolean z7;
        ?? r7;
        int i10;
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingTop, -2);
        int i11 = size - paddingLeft;
        int i12 = this.f7865J;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = i12 + (i14 / i13);
        int childCount = getChildCount();
        int iMax = 0;
        int i16 = 0;
        boolean z8 = false;
        int i17 = 0;
        int iMax2 = 0;
        int i18 = 0;
        long j8 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            int i19 = size2;
            if (childAt.getVisibility() == 8) {
                i10 = i15;
            } else {
                boolean z9 = childAt instanceof ActionMenuItemView;
                i17++;
                if (z9) {
                    int i20 = this.f7866K;
                    r7 = 0;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    r7 = 0;
                }
                C2300c c2300c = (C2300c) childAt.getLayoutParams();
                c2300c.f7873f = r7;
                c2300c.f7870c = r7;
                c2300c.f7869b = r7;
                c2300c.f7871d = r7;
                ((LinearLayout.LayoutParams) c2300c).leftMargin = r7;
                ((LinearLayout.LayoutParams) c2300c).rightMargin = r7;
                c2300c.f7872e = z9 && ((ActionMenuItemView) childAt).m9418s();
                int iM9660L = m9660L(childAt, i15, c2300c.f7868a ? 1 : i13, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iM9660L);
                i10 = i15;
                if (c2300c.f7871d) {
                    i18++;
                }
                if (c2300c.f7868a) {
                    z8 = true;
                }
                i13 -= iM9660L;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iM9660L == 1) {
                    j8 |= (long) (1 << i16);
                }
            }
            i16++;
            size2 = i19;
            i15 = i10;
        }
        int i21 = size2;
        int i22 = i15;
        char c7 = 2;
        boolean z10 = z8 && i17 == 2;
        boolean z11 = false;
        while (true) {
            if (i18 <= 0 || i13 <= 0) {
                j7 = 1;
                break;
            }
            int i23 = C3553a.e.API_PRIORITY_OTHER;
            long j9 = 0;
            char c8 = c7;
            int i24 = 0;
            int i25 = 0;
            j7 = 1;
            while (i25 < childCount) {
                C2300c c2300c2 = (C2300c) getChildAt(i25).getLayoutParams();
                boolean z12 = z10;
                if (c2300c2.f7871d) {
                    int i26 = c2300c2.f7869b;
                    if (i26 < i23) {
                        j9 = 1 << i25;
                        i23 = i26;
                        i24 = 1;
                    } else if (i26 == i23) {
                        j9 |= 1 << i25;
                        i24++;
                    }
                }
                i25++;
                z10 = z12;
            }
            boolean z13 = z10;
            j8 |= j9;
            if (i24 > i13) {
                break;
            }
            int i27 = i23 + 1;
            int i28 = 0;
            while (i28 < childCount) {
                View childAt2 = getChildAt(i28);
                C2300c c2300c3 = (C2300c) childAt2.getLayoutParams();
                long j10 = 1 << i28;
                if ((j9 & j10) == 0) {
                    if (c2300c3.f7869b == i27) {
                        j8 |= j10;
                    }
                    i28 = i28;
                } else {
                    if (!z13 || !c2300c3.f7872e) {
                        z7 = true;
                    } else if (i13 == 1) {
                        int i29 = this.f7866K;
                        z7 = true;
                        childAt2.setPadding(i29 + i22, 0, i29, 0);
                    } else {
                        z7 = true;
                    }
                    c2300c3.f7869b++;
                    c2300c3.f7873f = z7;
                    i13--;
                }
                i28++;
            }
            c7 = c8;
            z10 = z13;
            z11 = true;
        }
        boolean z14 = !z8 && i17 == 1;
        if (i13 <= 0 || j8 == 0 || (i13 >= i17 - 1 && !z14 && iMax2 <= 1)) {
            i9 = 0;
        } else {
            float fBitCount = Long.bitCount(j8);
            if (z14) {
                i9 = 0;
            } else {
                if ((j8 & j7) != 0) {
                    i9 = 0;
                    if (!((C2300c) getChildAt(0).getLayoutParams()).f7872e) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i9 = 0;
                }
                int i30 = childCount - 1;
                if ((j8 & ((long) (1 << i30))) != 0 && !((C2300c) getChildAt(i30).getLayoutParams()).f7872e) {
                    fBitCount -= 0.5f;
                }
            }
            int i31 = fBitCount > 0.0f ? (int) ((i13 * i22) / fBitCount) : i9;
            boolean z15 = z11;
            for (int i32 = i9; i32 < childCount; i32++) {
                if ((j8 & ((long) (1 << i32))) != 0) {
                    View childAt3 = getChildAt(i32);
                    C2300c c2300c4 = (C2300c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c2300c4.f7870c = i31;
                        c2300c4.f7873f = true;
                        if (i32 == 0 && !c2300c4.f7872e) {
                            ((LinearLayout.LayoutParams) c2300c4).leftMargin = (-i31) / 2;
                        }
                        z15 = true;
                    } else if (c2300c4.f7868a) {
                        c2300c4.f7870c = i31;
                        c2300c4.f7873f = true;
                        ((LinearLayout.LayoutParams) c2300c4).rightMargin = (-i31) / 2;
                        z15 = true;
                    } else {
                        if (i32 != 0) {
                            ((LinearLayout.LayoutParams) c2300c4).leftMargin = i31 / 2;
                        }
                        if (i32 != childCount - 1) {
                            ((LinearLayout.LayoutParams) c2300c4).rightMargin = i31 / 2;
                        }
                    }
                }
            }
            z11 = z15;
        }
        if (z11) {
            for (int i33 = i9; i33 < childCount; i33++) {
                View childAt4 = getChildAt(i33);
                C2300c c2300c5 = (C2300c) childAt4.getLayoutParams();
                if (c2300c5.f7873f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c2300c5.f7869b * i22) + c2300c5.f7870c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i11, mode != 1073741824 ? iMax : i21);
    }

    /* JADX INFO: renamed from: B */
    public void m9662B() {
        C2345c c2345c = this.f7860E;
        if (c2345c != null) {
            c2345c.m10008A();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AbstractC2319Q
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C2300c generateDefaultLayoutParams() {
        C2300c c2300c = new C2300c(-2, -2);
        ((LinearLayout.LayoutParams) c2300c).gravity = 16;
        return c2300c;
    }

    @Override // androidx.appcompat.widget.AbstractC2319Q
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C2300c generateLayoutParams(AttributeSet attributeSet) {
        return new C2300c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AbstractC2319Q
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C2300c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C2300c c2300c = layoutParams instanceof C2300c ? new C2300c((C2300c) layoutParams) : new C2300c(layoutParams);
        if (((LinearLayout.LayoutParams) c2300c).gravity <= 0) {
            ((LinearLayout.LayoutParams) c2300c).gravity = 16;
        }
        return c2300c;
    }

    /* JADX INFO: renamed from: F */
    public C2300c m9666F() {
        C2300c c2300cGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        c2300cGenerateDefaultLayoutParams.f7868a = true;
        return c2300cGenerateDefaultLayoutParams;
    }

    /* JADX INFO: renamed from: G */
    protected boolean m9667G(int i7) {
        boolean zMo9414a = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof InterfaceC2298a)) {
            zMo9414a = ((InterfaceC2298a) childAt).mo9414a();
        }
        return (i7 <= 0 || !(childAt2 instanceof InterfaceC2298a)) ? zMo9414a : ((InterfaceC2298a) childAt2).mo9415b() | zMo9414a;
    }

    /* JADX INFO: renamed from: H */
    public boolean m9668H() {
        C2345c c2345c = this.f7860E;
        return c2345c != null && c2345c.m10010D();
    }

    /* JADX INFO: renamed from: I */
    public boolean m9669I() {
        C2345c c2345c = this.f7860E;
        return c2345c != null && c2345c.m10012F();
    }

    /* JADX INFO: renamed from: J */
    public boolean m9670J() {
        C2345c c2345c = this.f7860E;
        return c2345c != null && c2345c.m10013G();
    }

    /* JADX INFO: renamed from: K */
    public boolean m9671K() {
        return this.f7859D;
    }

    /* JADX INFO: renamed from: N */
    public C2280e m9672N() {
        return this.f7856A;
    }

    /* JADX INFO: renamed from: O */
    public void m9673O(InterfaceC2285j.a aVar, C2280e.a aVar2) {
        this.f7861F = aVar;
        this.f7862G = aVar2;
    }

    /* JADX INFO: renamed from: P */
    public boolean m9674P() {
        C2345c c2345c = this.f7860E;
        return c2345c != null && c2345c.m10019M();
    }

    @Override // androidx.appcompat.view.menu.C2280e.b
    /* JADX INFO: renamed from: a */
    public boolean mo9422a(C2282g c2282g) {
        return this.f7856A.m9504O(c2282g, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2286k
    /* JADX INFO: renamed from: b */
    public void mo9423b(C2280e c2280e) {
        this.f7856A = c2280e;
    }

    @Override // androidx.appcompat.widget.AbstractC2319Q, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2300c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f7856A == null) {
            Context context = getContext();
            C2280e c2280e = new C2280e(context);
            this.f7856A = c2280e;
            c2280e.mo9511W(new C2301d());
            C2345c c2345c = new C2345c(context);
            this.f7860E = c2345c;
            c2345c.m10018L(true);
            C2345c c2345c2 = this.f7860E;
            InterfaceC2285j.a c2299b = this.f7861F;
            if (c2299b == null) {
                c2299b = new C2299b();
            }
            c2345c2.mo9436h(c2299b);
            this.f7856A.m9518c(this.f7860E, this.f7857B);
            this.f7860E.m10016J(this);
        }
        return this.f7856A;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f7860E.m10009C();
    }

    public int getPopupTheme() {
        return this.f7858C;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2345c c2345c = this.f7860E;
        if (c2345c != null) {
            c2345c.mo9433d(false);
            if (this.f7860E.m10013G()) {
                this.f7860E.m10010D();
                this.f7860E.m10019M();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9662B();
    }

    @Override // androidx.appcompat.widget.AbstractC2319Q, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int width;
        int paddingLeft;
        if (!this.f7863H) {
            super.onLayout(z7, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = i9 - i7;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean zM10112b = AbstractC2362k0.m10112b(this);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C2300c c2300c = (C2300c) childAt.getLayoutParams();
                if (c2300c.f7868a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m9667G(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM10112b) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c2300c).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c2300c).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i16, width, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c2300c).leftMargin) + ((LinearLayout.LayoutParams) c2300c).rightMargin;
                    m9667G(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        int iMax = Math.max(0, i19 > 0 ? paddingRight / i19 : 0);
        if (zM10112b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                C2300c c2300c2 = (C2300c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c2300c2.f7868a) {
                    int i21 = width2 - ((LinearLayout.LayoutParams) c2300c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width2 = i21 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c2300c2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            C2300c c2300c3 = (C2300c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c2300c3.f7868a) {
                int i24 = paddingLeft2 + ((LinearLayout.LayoutParams) c2300c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft2 = i24 + measuredWidth4 + ((LinearLayout.LayoutParams) c2300c3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.AbstractC2319Q, android.view.View
    protected void onMeasure(int i7, int i8) {
        C2280e c2280e;
        boolean z7 = this.f7863H;
        boolean z8 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.f7863H = z8;
        if (z7 != z8) {
            this.f7864I = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.f7863H && (c2280e = this.f7856A) != null && size != this.f7864I) {
            this.f7864I = size;
            c2280e.mo9503N(true);
        }
        int childCount = getChildCount();
        if (this.f7863H && childCount > 0) {
            m9661M(i7, i8);
            return;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            C2300c c2300c = (C2300c) getChildAt(i9).getLayoutParams();
            ((LinearLayout.LayoutParams) c2300c).rightMargin = 0;
            ((LinearLayout.LayoutParams) c2300c).leftMargin = 0;
        }
        super.onMeasure(i7, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z7) {
        this.f7860E.m10015I(z7);
    }

    public void setOnMenuItemClickListener(InterfaceC2302e interfaceC2302e) {
        this.f7867L = interfaceC2302e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f7860E.m10017K(drawable);
    }

    public void setOverflowReserved(boolean z7) {
        this.f7859D = z7;
    }

    public void setPopupTheme(int i7) {
        if (this.f7858C != i7) {
            this.f7858C = i7;
            if (i7 == 0) {
                this.f7857B = getContext();
            } else {
                this.f7857B = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(C2345c c2345c) {
        this.f7860E = c2345c;
        c2345c.m10016J(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.f7865J = (int) (56.0f * f7);
        this.f7866K = (int) (f7 * 4.0f);
        this.f7857B = context;
        this.f7858C = 0;
    }
}
