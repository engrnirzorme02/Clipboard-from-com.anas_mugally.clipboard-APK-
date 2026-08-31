package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C2265a;
import androidx.appcompat.view.menu.AbstractC2276a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C2280e;
import androidx.appcompat.view.menu.C2282g;
import androidx.appcompat.view.menu.C2284i;
import androidx.appcompat.view.menu.InterfaceC2285j;
import androidx.appcompat.view.menu.InterfaceC2286k;
import androidx.appcompat.view.menu.SubMenuC2288m;
import java.util.ArrayList;
import p041F.AbstractC0400a;
import p111O.AbstractC1035b;
import p255h.AbstractC5520a;
import p255h.AbstractC5526g;
import p295m.InterfaceC6318e;

/* JADX INFO: renamed from: androidx.appcompat.widget.c */
/* JADX INFO: loaded from: classes.dex */
class C2345c extends AbstractC2276a implements AbstractC1035b.a {

    /* JADX INFO: renamed from: A */
    private int f8183A;

    /* JADX INFO: renamed from: B */
    private int f8184B;

    /* JADX INFO: renamed from: C */
    private int f8185C;

    /* JADX INFO: renamed from: D */
    private boolean f8186D;

    /* JADX INFO: renamed from: E */
    private boolean f8187E;

    /* JADX INFO: renamed from: F */
    private boolean f8188F;

    /* JADX INFO: renamed from: G */
    private boolean f8189G;

    /* JADX INFO: renamed from: H */
    private int f8190H;

    /* JADX INFO: renamed from: I */
    private final SparseBooleanArray f8191I;

    /* JADX INFO: renamed from: J */
    e f8192J;

    /* JADX INFO: renamed from: K */
    a f8193K;

    /* JADX INFO: renamed from: L */
    c f8194L;

    /* JADX INFO: renamed from: M */
    private b f8195M;

    /* JADX INFO: renamed from: N */
    final f f8196N;

    /* JADX INFO: renamed from: O */
    int f8197O;

    /* JADX INFO: renamed from: v */
    d f8198v;

    /* JADX INFO: renamed from: w */
    private Drawable f8199w;

    /* JADX INFO: renamed from: x */
    private boolean f8200x;

    /* JADX INFO: renamed from: y */
    private boolean f8201y;

    /* JADX INFO: renamed from: z */
    private boolean f8202z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$a */
    private class a extends C2284i {
        public a(Context context, SubMenuC2288m subMenuC2288m, View view) {
            super(context, subMenuC2288m, view, false, AbstractC5520a.f20971i);
            if (!((C2282g) subMenuC2288m.getItem()).m9555l()) {
                View view2 = C2345c.this.f8198v;
                m9581f(view2 == null ? (View) ((AbstractC2276a) C2345c.this).f7614t : view2);
            }
            m9585j(C2345c.this.f8196N);
        }

        @Override // androidx.appcompat.view.menu.C2284i
        /* JADX INFO: renamed from: e */
        protected void mo9580e() {
            C2345c c2345c = C2345c.this;
            c2345c.f8193K = null;
            c2345c.f8197O = 0;
            super.mo9580e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$b */
    private class b extends ActionMenuItemView.AbstractC2275b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC2275b
        /* JADX INFO: renamed from: a */
        public InterfaceC6318e mo9421a() {
            a aVar = C2345c.this.f8193K;
            if (aVar != null) {
                return aVar.m9578c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c */
    private class c implements Runnable {

        /* JADX INFO: renamed from: a */
        private e f8205a;

        public c(e eVar) {
            this.f8205a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC2276a) C2345c.this).f7608c != null) {
                ((AbstractC2276a) C2345c.this).f7608c.m9520d();
            }
            View view = (View) ((AbstractC2276a) C2345c.this).f7614t;
            if (view != null && view.getWindowToken() != null && this.f8205a.m9587m()) {
                C2345c.this.f8192J = this.f8205a;
            }
            C2345c.this.f8194L = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$d */
    private class d extends AppCompatImageView implements ActionMenuView.InterfaceC2298a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.c$d$a */
        class a extends AbstractViewOnTouchListenerC2318P {

            /* JADX INFO: renamed from: u */
            final /* synthetic */ C2345c f8208u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C2345c c2345c) {
                super(view);
                this.f8208u = c2345c;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC2318P
            /* JADX INFO: renamed from: b */
            public InterfaceC6318e mo9419b() {
                e eVar = C2345c.this.f8192J;
                if (eVar == null) {
                    return null;
                }
                return eVar.m9578c();
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC2318P
            /* JADX INFO: renamed from: c */
            public boolean mo9420c() {
                C2345c.this.m10019M();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC2318P
            /* JADX INFO: renamed from: d */
            public boolean mo9805d() {
                C2345c c2345c = C2345c.this;
                if (c2345c.f8194L != null) {
                    return false;
                }
                c2345c.m10010D();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC5520a.f20970h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            AbstractC2358i0.m10085a(this, getContentDescription());
            setOnTouchListener(new a(this, C2345c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC2298a
        /* JADX INFO: renamed from: a */
        public boolean mo9414a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC2298a
        /* JADX INFO: renamed from: b */
        public boolean mo9415b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C2345c.this.m10019M();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i7, int i8, int i9, int i10) {
            boolean frame = super.setFrame(i7, i8, i9, i10);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                AbstractC0400a.m1706l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$e */
    private class e extends C2284i {
        public e(Context context, C2280e c2280e, View view, boolean z7) {
            super(context, c2280e, view, z7, AbstractC5520a.f20971i);
            m9583h(8388613);
            m9585j(C2345c.this.f8196N);
        }

        @Override // androidx.appcompat.view.menu.C2284i
        /* JADX INFO: renamed from: e */
        protected void mo9580e() {
            if (((AbstractC2276a) C2345c.this).f7608c != null) {
                ((AbstractC2276a) C2345c.this).f7608c.close();
            }
            C2345c.this.f8192J = null;
            super.mo9580e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$f */
    private class f implements InterfaceC2285j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j.a
        /* JADX INFO: renamed from: c */
        public void mo9249c(C2280e c2280e, boolean z7) {
            if (c2280e instanceof SubMenuC2288m) {
                c2280e.mo9495F().m9522e(false);
            }
            InterfaceC2285j.a aVarM9441o = C2345c.this.m9441o();
            if (aVarM9441o != null) {
                aVarM9441o.mo9249c(c2280e, z7);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC2285j.a
        /* JADX INFO: renamed from: d */
        public boolean mo9250d(C2280e c2280e) {
            if (c2280e == ((AbstractC2276a) C2345c.this).f7608c) {
                return false;
            }
            C2345c.this.f8197O = ((SubMenuC2288m) c2280e).getItem().getItemId();
            InterfaceC2285j.a aVarM9441o = C2345c.this.m9441o();
            if (aVarM9441o != null) {
                return aVarM9441o.mo9250d(c2280e);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$g */
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        public int f8212a;

        /* JADX INFO: renamed from: androidx.appcompat.widget.c$g$a */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i7) {
                return new g[i7];
            }
        }

        g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f8212a);
        }

        g(Parcel parcel) {
            this.f8212a = parcel.readInt();
        }
    }

    public C2345c(Context context) {
        super(context, AbstractC5526g.f21081c, AbstractC5526g.f21080b);
        this.f8191I = new SparseBooleanArray();
        this.f8196N = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    private View m10000B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f7614t;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof InterfaceC2286k.a) && ((InterfaceC2286k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public boolean m10008A() {
        return m10010D() | m10011E();
    }

    /* JADX INFO: renamed from: C */
    public Drawable m10009C() {
        d dVar = this.f8198v;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f8200x) {
            return this.f8199w;
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public boolean m10010D() {
        Object obj;
        c cVar = this.f8194L;
        if (cVar != null && (obj = this.f7614t) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f8194L = null;
            return true;
        }
        e eVar = this.f8192J;
        if (eVar == null) {
            return false;
        }
        eVar.m9577b();
        return true;
    }

    /* JADX INFO: renamed from: E */
    public boolean m10011E() {
        a aVar = this.f8193K;
        if (aVar == null) {
            return false;
        }
        aVar.m9577b();
        return true;
    }

    /* JADX INFO: renamed from: F */
    public boolean m10012F() {
        return this.f8194L != null || m10013G();
    }

    /* JADX INFO: renamed from: G */
    public boolean m10013G() {
        e eVar = this.f8192J;
        return eVar != null && eVar.m9579d();
    }

    /* JADX INFO: renamed from: H */
    public void m10014H(Configuration configuration) {
        if (!this.f8186D) {
            this.f8185C = C2265a.m9367b(this.f7607b).m9370d();
        }
        C2280e c2280e = this.f7608c;
        if (c2280e != null) {
            c2280e.mo9503N(true);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m10015I(boolean z7) {
        this.f8189G = z7;
    }

    /* JADX INFO: renamed from: J */
    public void m10016J(ActionMenuView actionMenuView) {
        this.f7614t = actionMenuView;
        actionMenuView.mo9423b(this.f7608c);
    }

    /* JADX INFO: renamed from: K */
    public void m10017K(Drawable drawable) {
        d dVar = this.f8198v;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f8200x = true;
            this.f8199w = drawable;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m10018L(boolean z7) {
        this.f8201y = z7;
        this.f8202z = true;
    }

    /* JADX INFO: renamed from: M */
    public boolean m10019M() {
        C2280e c2280e;
        if (!this.f8201y || m10013G() || (c2280e = this.f7608c) == null || this.f7614t == null || this.f8194L != null || c2280e.m9492B().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f7607b, this.f7608c, this.f8198v, true));
        this.f8194L = cVar;
        ((View) this.f7614t).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2276a
    /* JADX INFO: renamed from: b */
    public void mo9431b(C2282g c2282g, InterfaceC2286k.a aVar) {
        aVar.mo9417e(c2282g, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f7614t);
        if (this.f8195M == null) {
            this.f8195M = new b();
        }
        actionMenuItemView.setPopupCallback(this.f8195M);
    }

    @Override // androidx.appcompat.view.menu.AbstractC2276a, androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: c */
    public void mo9432c(C2280e c2280e, boolean z7) {
        m10008A();
        super.mo9432c(c2280e, z7);
    }

    @Override // androidx.appcompat.view.menu.AbstractC2276a, androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: d */
    public void mo9433d(boolean z7) {
        super.mo9433d(z7);
        ((View) this.f7614t).requestLayout();
        C2280e c2280e = this.f7608c;
        boolean z8 = false;
        if (c2280e != null) {
            ArrayList arrayListM9536u = c2280e.m9536u();
            int size = arrayListM9536u.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC1035b abstractC1035bMo2092b = ((C2282g) arrayListM9536u.get(i7)).mo2092b();
                if (abstractC1035bMo2092b != null) {
                    abstractC1035bMo2092b.m4617h(this);
                }
            }
        }
        C2280e c2280e2 = this.f7608c;
        ArrayList arrayListM9492B = c2280e2 != null ? c2280e2.m9492B() : null;
        if (this.f8201y && arrayListM9492B != null) {
            int size2 = arrayListM9492B.size();
            if (size2 == 1) {
                z8 = !((C2282g) arrayListM9492B.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z8 = true;
            }
        }
        if (z8) {
            if (this.f8198v == null) {
                this.f8198v = new d(this.f7606a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f8198v.getParent();
            if (viewGroup != this.f7614t) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f8198v);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f7614t;
                actionMenuView.addView(this.f8198v, actionMenuView.m9666F());
            }
        } else {
            d dVar = this.f8198v;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f7614t;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f8198v);
                }
            }
        }
        ((ActionMenuView) this.f7614t).setOverflowReserved(this.f8201y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: e */
    public boolean mo9455e() {
        ArrayList arrayListM9496G;
        int size;
        int i7;
        int iM9660L;
        ?? r7;
        C2345c c2345c = this;
        C2280e c2280e = c2345c.f7608c;
        View view = null;
        ?? r8 = 0;
        if (c2280e != null) {
            arrayListM9496G = c2280e.m9496G();
            size = arrayListM9496G.size();
        } else {
            arrayListM9496G = null;
            size = 0;
        }
        int i8 = c2345c.f8185C;
        int i9 = c2345c.f8184B;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c2345c.f7614t;
        boolean z7 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C2282g c2282g = (C2282g) arrayListM9496G.get(i12);
            if (c2282g.m9558o()) {
                i10++;
            } else if (c2282g.m9557n()) {
                i11++;
            } else {
                z7 = true;
            }
            if (c2345c.f8189G && c2282g.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (c2345c.f8201y && (z7 || i11 + i10 > i8)) {
            i8--;
        }
        int i13 = i8 - i10;
        SparseBooleanArray sparseBooleanArray = c2345c.f8191I;
        sparseBooleanArray.clear();
        if (c2345c.f8187E) {
            int i14 = c2345c.f8190H;
            iM9660L = i9 / i14;
            i7 = i14 + ((i9 % i14) / iM9660L);
        } else {
            i7 = 0;
            iM9660L = 0;
        }
        int i15 = 0;
        int i16 = 0;
        ?? r9 = c2345c;
        while (i15 < size) {
            ?? r15 = (C2282g) arrayListM9496G.get(i15);
            if (r15.m9558o()) {
                View viewMo9442p = r9.mo9442p(r15, view, viewGroup);
                if (r9.f8187E) {
                    iM9660L -= ActionMenuView.m9660L(viewMo9442p, i7, iM9660L, iMakeMeasureSpec, r8);
                } else {
                    viewMo9442p.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewMo9442p.getMeasuredWidth();
                i9 -= measuredWidth;
                if (i16 == 0) {
                    i16 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.m9564u(true);
                r7 = r8;
            } else if (r15.m9557n()) {
                int groupId2 = r15.getGroupId();
                boolean z8 = sparseBooleanArray.get(groupId2);
                boolean z9 = (i13 > 0 || z8) && i9 > 0 && (!r9.f8187E || iM9660L > 0);
                boolean z10 = z9;
                if (z9) {
                    View viewMo9442p2 = r9.mo9442p(r15, null, viewGroup);
                    if (r9.f8187E) {
                        int iM9660L2 = ActionMenuView.m9660L(viewMo9442p2, i7, iM9660L, iMakeMeasureSpec, 0);
                        iM9660L -= iM9660L2;
                        if (iM9660L2 == 0) {
                            z10 = false;
                        }
                    } else {
                        viewMo9442p2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z11 = z10;
                    int measuredWidth2 = viewMo9442p2.getMeasuredWidth();
                    i9 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z9 = z11 & (!r9.f8187E ? i9 + i16 <= 0 : i9 < 0);
                }
                if (z9 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z8) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i17 = 0; i17 < i15; i17++) {
                        C2282g c2282g2 = (C2282g) arrayListM9496G.get(i17);
                        if (c2282g2.getGroupId() == groupId2) {
                            if (c2282g2.m9555l()) {
                                i13++;
                            }
                            c2282g2.m9564u(false);
                        }
                    }
                }
                if (z9) {
                    i13--;
                }
                r15.m9564u(z9);
                r7 = 0;
            } else {
                r7 = r8;
                r15.m9564u(r7);
            }
            i15++;
            r8 = r7;
            size = size;
            view = null;
            r9 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2276a, androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: i */
    public void mo9437i(Context context, C2280e c2280e) {
        super.mo9437i(context, c2280e);
        Resources resources = context.getResources();
        C2265a c2265aM9367b = C2265a.m9367b(context);
        if (!this.f8202z) {
            this.f8201y = c2265aM9367b.m9372f();
        }
        if (!this.f8188F) {
            this.f8183A = c2265aM9367b.m9369c();
        }
        if (!this.f8186D) {
            this.f8185C = c2265aM9367b.m9370d();
        }
        int measuredWidth = this.f8183A;
        if (this.f8201y) {
            if (this.f8198v == null) {
                d dVar = new d(this.f7606a);
                this.f8198v = dVar;
                if (this.f8200x) {
                    dVar.setImageDrawable(this.f8199w);
                    this.f8199w = null;
                    this.f8200x = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f8198v.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f8198v.getMeasuredWidth();
        } else {
            this.f8198v = null;
        }
        this.f8184B = measuredWidth;
        this.f8190H = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: j */
    public void mo9456j(Parcelable parcelable) {
        int i7;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i7 = ((g) parcelable).f8212a) > 0 && (menuItemFindItem = this.f7608c.findItem(i7)) != null) {
            mo9439l((SubMenuC2288m) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC2276a, androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: l */
    public boolean mo9439l(SubMenuC2288m subMenuC2288m) {
        boolean z7 = false;
        if (!subMenuC2288m.hasVisibleItems()) {
            return false;
        }
        SubMenuC2288m subMenuC2288m2 = subMenuC2288m;
        while (subMenuC2288m2.m9590j0() != this.f7608c) {
            subMenuC2288m2 = (SubMenuC2288m) subMenuC2288m2.m9590j0();
        }
        View viewM10000B = m10000B(subMenuC2288m2.getItem());
        if (viewM10000B == null) {
            return false;
        }
        this.f8197O = subMenuC2288m.getItem().getItemId();
        int size = subMenuC2288m.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = subMenuC2288m.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                z7 = true;
                break;
            }
        }
        a aVar = new a(this.f7607b, subMenuC2288m, viewM10000B);
        this.f8193K = aVar;
        aVar.m9582g(z7);
        this.f8193K.m9586k();
        super.mo9439l(subMenuC2288m);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: m */
    public Parcelable mo9458m() {
        g gVar = new g();
        gVar.f8212a = this.f8197O;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2276a
    /* JADX INFO: renamed from: n */
    public boolean mo9440n(ViewGroup viewGroup, int i7) {
        if (viewGroup.getChildAt(i7) == this.f8198v) {
            return false;
        }
        return super.mo9440n(viewGroup, i7);
    }

    @Override // androidx.appcompat.view.menu.AbstractC2276a
    /* JADX INFO: renamed from: p */
    public View mo9442p(C2282g c2282g, View view, ViewGroup viewGroup) {
        View actionView = c2282g.getActionView();
        if (actionView == null || c2282g.m9553j()) {
            actionView = super.mo9442p(c2282g, view, viewGroup);
        }
        actionView.setVisibility(c2282g.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2276a
    /* JADX INFO: renamed from: q */
    public InterfaceC2286k mo9443q(ViewGroup viewGroup) {
        InterfaceC2286k interfaceC2286k = this.f7614t;
        InterfaceC2286k interfaceC2286kMo9443q = super.mo9443q(viewGroup);
        if (interfaceC2286k != interfaceC2286kMo9443q) {
            ((ActionMenuView) interfaceC2286kMo9443q).setPresenter(this);
        }
        return interfaceC2286kMo9443q;
    }

    @Override // androidx.appcompat.view.menu.AbstractC2276a
    /* JADX INFO: renamed from: s */
    public boolean mo9445s(int i7, C2282g c2282g) {
        return c2282g.m9555l();
    }
}
