package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC2263x;
import androidx.fragment.app.AbstractC2606x;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h;
import com.google.android.material.internal.AbstractC4529e;
import com.google.android.material.internal.AbstractC4546v;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p033E.C0247b;
import p045F3.AbstractC0422b;
import p069I3.C0622i;
import p111O.AbstractC1030Z;
import p111O.C0982A0;
import p111O.InterfaceC0993G;
import p263i.AbstractC5659a;
import p325p3.AbstractC6742c;
import p325p3.AbstractC6744e;
import p325p3.AbstractC6745f;
import p325p3.AbstractC6746g;
import p325p3.AbstractC6748i;
import p325p3.AbstractC6750k;
import p325p3.AbstractC6751l;
import p325p3.AbstractC6752m;
import p405z3.ViewOnTouchListenerC7610a;

/* JADX INFO: renamed from: com.google.android.material.datepicker.r */
/* JADX INFO: loaded from: classes2.dex */
public class C4486r<S> extends DialogInterfaceOnCancelListenerC2590h {

    /* JADX INFO: renamed from: h1 */
    static final Object f16936h1 = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: i1 */
    static final Object f16937i1 = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: j1 */
    static final Object f16938j1 = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: E0 */
    private final LinkedHashSet f16939E0 = new LinkedHashSet();

    /* JADX INFO: renamed from: F0 */
    private final LinkedHashSet f16940F0 = new LinkedHashSet();

    /* JADX INFO: renamed from: G0 */
    private final LinkedHashSet f16941G0 = new LinkedHashSet();

    /* JADX INFO: renamed from: H0 */
    private final LinkedHashSet f16942H0 = new LinkedHashSet();

    /* JADX INFO: renamed from: I0 */
    private int f16943I0;

    /* JADX INFO: renamed from: J0 */
    private InterfaceC4477i f16944J0;

    /* JADX INFO: renamed from: K0 */
    private AbstractC4493y f16945K0;

    /* JADX INFO: renamed from: L0 */
    private C4469a f16946L0;

    /* JADX INFO: renamed from: M0 */
    private C4482n f16947M0;

    /* JADX INFO: renamed from: N0 */
    private int f16948N0;

    /* JADX INFO: renamed from: O0 */
    private CharSequence f16949O0;

    /* JADX INFO: renamed from: P0 */
    private boolean f16950P0;

    /* JADX INFO: renamed from: Q0 */
    private int f16951Q0;

    /* JADX INFO: renamed from: R0 */
    private int f16952R0;

    /* JADX INFO: renamed from: S0 */
    private CharSequence f16953S0;

    /* JADX INFO: renamed from: T0 */
    private int f16954T0;

    /* JADX INFO: renamed from: U0 */
    private CharSequence f16955U0;

    /* JADX INFO: renamed from: V0 */
    private int f16956V0;

    /* JADX INFO: renamed from: W0 */
    private CharSequence f16957W0;

    /* JADX INFO: renamed from: X0 */
    private int f16958X0;

    /* JADX INFO: renamed from: Y0 */
    private CharSequence f16959Y0;

    /* JADX INFO: renamed from: Z0 */
    private TextView f16960Z0;

    /* JADX INFO: renamed from: a1 */
    private TextView f16961a1;

    /* JADX INFO: renamed from: b1 */
    private CheckableImageButton f16962b1;

    /* JADX INFO: renamed from: c1 */
    private C0622i f16963c1;

    /* JADX INFO: renamed from: d1 */
    private Button f16964d1;

    /* JADX INFO: renamed from: e1 */
    private boolean f16965e1;

    /* JADX INFO: renamed from: f1 */
    private CharSequence f16966f1;

    /* JADX INFO: renamed from: g1 */
    private CharSequence f16967g1;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.r$a */
    class a implements InterfaceC0993G {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f16968a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f16969b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f16970c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f16971d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f16972e;

        a(int i7, View view, int i8, int i9, int i10) {
            this.f16968a = i7;
            this.f16969b = view;
            this.f16970c = i8;
            this.f16971d = i9;
            this.f16972e = i10;
        }

        @Override // p111O.InterfaceC0993G
        /* JADX INFO: renamed from: a */
        public C0982A0 mo4369a(View view, C0982A0 c0982a0) {
            C0247b c0247bM4272f = c0982a0.m4272f(C0982A0.p.m4332e());
            if (this.f16968a >= 0) {
                this.f16969b.getLayoutParams().height = this.f16968a + c0247bM4272f.f985b;
                View view2 = this.f16969b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f16969b;
            view3.setPadding(this.f16970c + c0247bM4272f.f984a, this.f16971d + c0247bM4272f.f985b, this.f16972e + c0247bM4272f.f986c, view3.getPaddingBottom());
            return c0982a0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.r$b */
    class b extends AbstractC4492x {
        b() {
        }

        @Override // com.google.android.material.datepicker.AbstractC4492x
        /* JADX INFO: renamed from: a */
        public void mo20364a() {
            C4486r.this.f16964d1.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.AbstractC4492x
        /* JADX INFO: renamed from: b */
        public void mo20365b(Object obj) {
            C4486r c4486r = C4486r.this;
            c4486r.m20359F2(c4486r.m20361q2());
            C4486r.this.f16964d1.setEnabled(C4486r.this.m20348n2().mo20277F());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.r$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        final InterfaceC4477i f16975a;

        /* JADX INFO: renamed from: c */
        C4469a f16977c;

        /* JADX INFO: renamed from: b */
        int f16976b = 0;

        /* JADX INFO: renamed from: d */
        int f16978d = 0;

        /* JADX INFO: renamed from: e */
        CharSequence f16979e = null;

        /* JADX INFO: renamed from: f */
        int f16980f = 0;

        /* JADX INFO: renamed from: g */
        CharSequence f16981g = null;

        /* JADX INFO: renamed from: h */
        int f16982h = 0;

        /* JADX INFO: renamed from: i */
        CharSequence f16983i = null;

        /* JADX INFO: renamed from: j */
        int f16984j = 0;

        /* JADX INFO: renamed from: k */
        CharSequence f16985k = null;

        /* JADX INFO: renamed from: l */
        int f16986l = 0;

        /* JADX INFO: renamed from: m */
        CharSequence f16987m = null;

        /* JADX INFO: renamed from: n */
        Object f16988n = null;

        /* JADX INFO: renamed from: o */
        int f16989o = 0;

        private c(InterfaceC4477i interfaceC4477i) {
            this.f16975a = interfaceC4477i;
        }

        /* JADX INFO: renamed from: b */
        private C4489u m20366b() {
            if (!this.f16975a.mo20278I().isEmpty()) {
                C4489u c4489uM20375h = C4489u.m20375h(((Long) this.f16975a.mo20278I().iterator().next()).longValue());
                if (m20368d(c4489uM20375h, this.f16977c)) {
                    return c4489uM20375h;
                }
            }
            C4489u c4489uM20376m = C4489u.m20376m();
            return m20368d(c4489uM20376m, this.f16977c) ? c4489uM20376m : this.f16977c.m20250n();
        }

        /* JADX INFO: renamed from: c */
        public static c m20367c() {
            return new c(new C4494z());
        }

        /* JADX INFO: renamed from: d */
        private static boolean m20368d(C4489u c4489u, C4469a c4469a) {
            return c4489u.compareTo(c4469a.m20250n()) >= 0 && c4489u.compareTo(c4469a.m20246h()) <= 0;
        }

        /* JADX INFO: renamed from: a */
        public C4486r m20369a() {
            if (this.f16977c == null) {
                this.f16977c = new C4469a.b().m20256a();
            }
            if (this.f16978d == 0) {
                this.f16978d = this.f16975a.mo20285y();
            }
            Object obj = this.f16988n;
            if (obj != null) {
                this.f16975a.mo20283p(obj);
            }
            if (this.f16977c.m20249m() == null) {
                this.f16977c.m20253s(m20366b());
            }
            return C4486r.m20357y2(this);
        }

        /* JADX INFO: renamed from: e */
        public c m20370e(Object obj) {
            this.f16988n = obj;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public c m20371f(CharSequence charSequence) {
            this.f16979e = charSequence;
            this.f16978d = 0;
            return this;
        }
    }

    /* JADX INFO: renamed from: B2 */
    static boolean m20337B2(Context context, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0422b.m1822f(context, AbstractC6742c.f26286z, C4482n.class.getCanonicalName()), new int[]{i7});
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z7;
    }

    /* JADX INFO: renamed from: C2 */
    private void m20338C2() {
        int iM20352t2 = m20352t2(m12214y1());
        C4482n c4482nM20321k2 = C4482n.m20321k2(m20348n2(), iM20352t2, this.f16946L0, null);
        this.f16947M0 = c4482nM20321k2;
        AbstractC4493y abstractC4493yM20373S1 = c4482nM20321k2;
        if (this.f16951Q0 == 1) {
            abstractC4493yM20373S1 = C4488t.m20373S1(m20348n2(), iM20352t2, this.f16946L0);
        }
        this.f16945K0 = abstractC4493yM20373S1;
        m20341G2();
        m20359F2(m20361q2());
        AbstractC2606x abstractC2606xM12391n = m12201t().m12391n();
        abstractC2606xM12391n.m12511p(AbstractC6746g.f26443z, this.f16945K0);
        abstractC2606xM12391n.mo12018i();
        this.f16945K0.mo20325Q1(new b());
    }

    /* JADX INFO: renamed from: D2 */
    public static long m20339D2() {
        return C4489u.m20376m().f16999f;
    }

    /* JADX INFO: renamed from: E2 */
    public static long m20340E2() {
        return AbstractC4466C.m20221k().getTimeInMillis();
    }

    /* JADX INFO: renamed from: G2 */
    private void m20341G2() {
        this.f16960Z0.setText((this.f16951Q0 == 1 && m20355w2()) ? this.f16967g1 : this.f16966f1);
    }

    /* JADX INFO: renamed from: H2 */
    private void m20342H2(CheckableImageButton checkableImageButton) {
        this.f16962b1.setContentDescription(this.f16951Q0 == 1 ? checkableImageButton.getContext().getString(AbstractC6750k.f26493O) : checkableImageButton.getContext().getString(AbstractC6750k.f26495Q));
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m20343h2(C4486r c4486r, View view) {
        c4486r.f16964d1.setEnabled(c4486r.m20348n2().mo20277F());
        c4486r.f16962b1.toggle();
        c4486r.f16951Q0 = c4486r.f16951Q0 == 1 ? 0 : 1;
        c4486r.m20342H2(c4486r.f16962b1);
        c4486r.m20338C2();
    }

    /* JADX INFO: renamed from: l2 */
    private static Drawable m20346l2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC5659a.m25175b(context, AbstractC6745f.f26385b));
        stateListDrawable.addState(new int[0], AbstractC5659a.m25175b(context, AbstractC6745f.f26386c));
        return stateListDrawable;
    }

    /* JADX INFO: renamed from: m2 */
    private void m20347m2(Window window) {
        if (this.f16965e1) {
            return;
        }
        View viewFindViewById = m12216z1().findViewById(AbstractC6746g.f26426i);
        AbstractC4529e.m20697a(window, true, AbstractC4546v.m20829d(viewFindViewById), null);
        int paddingTop = viewFindViewById.getPaddingTop();
        AbstractC1030Z.m4494t0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingLeft(), paddingTop, viewFindViewById.getPaddingRight()));
        this.f16965e1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public InterfaceC4477i m20348n2() {
        if (this.f16944J0 == null) {
            this.f16944J0 = (InterfaceC4477i) m12199s().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f16944J0;
    }

    /* JADX INFO: renamed from: o2 */
    private static CharSequence m20349o2(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    /* JADX INFO: renamed from: p2 */
    private String m20350p2() {
        return m20348n2().mo20275A(m12214y1());
    }

    /* JADX INFO: renamed from: r2 */
    private static int m20351r2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(AbstractC6744e.f26333a0);
        int i7 = C4489u.m20376m().f16997d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(AbstractC6744e.f26337c0) * i7) + ((i7 - 1) * resources.getDimensionPixelOffset(AbstractC6744e.f26345g0));
    }

    /* JADX INFO: renamed from: t2 */
    private int m20352t2(Context context) {
        int i7 = this.f16943I0;
        return i7 != 0 ? i7 : m20348n2().mo20276C(context);
    }

    /* JADX INFO: renamed from: u2 */
    private void m20353u2(Context context) {
        this.f16962b1.setTag(f16938j1);
        this.f16962b1.setImageDrawable(m20346l2(context));
        this.f16962b1.setChecked(this.f16951Q0 != 0);
        AbstractC1030Z.m4474j0(this.f16962b1, null);
        m20342H2(this.f16962b1);
        this.f16962b1.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4486r.m20343h2(this.f16935a, view);
            }
        });
    }

    /* JADX INFO: renamed from: v2 */
    static boolean m20354v2(Context context) {
        return m20337B2(context, R.attr.windowFullscreen);
    }

    /* JADX INFO: renamed from: w2 */
    private boolean m20355w2() {
        return m12147R().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: x2 */
    static boolean m20356x2(Context context) {
        return m20337B2(context, AbstractC6742c.f26239X);
    }

    /* JADX INFO: renamed from: y2 */
    static C4486r m20357y2(c cVar) {
        C4486r c4486r = new C4486r();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", cVar.f16976b);
        bundle.putParcelable("DATE_SELECTOR_KEY", cVar.f16975a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar.f16977c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", cVar.f16978d);
        bundle.putCharSequence("TITLE_TEXT_KEY", cVar.f16979e);
        bundle.putInt("INPUT_MODE_KEY", cVar.f16989o);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", cVar.f16980f);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", cVar.f16981g);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", cVar.f16982h);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", cVar.f16983i);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", cVar.f16984j);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", cVar.f16985k);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", cVar.f16986l);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", cVar.f16987m);
        c4486r.m12117E1(bundle);
        return c4486r;
    }

    /* JADX INFO: renamed from: A2 */
    public void m20358A2(View view) {
        Iterator it = this.f16939E0.iterator();
        while (it.hasNext()) {
            ((InterfaceC4487s) it.next()).mo20372a(m20362s2());
        }
        mo12082T1();
    }

    /* JADX INFO: renamed from: F2 */
    void m20359F2(String str) {
        this.f16961a1.setContentDescription(m20350p2());
        this.f16961a1.setText(str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: R0 */
    public final void mo12080R0(Bundle bundle) {
        super.mo12080R0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f16943I0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f16944J0);
        C4469a.b bVar = new C4469a.b(this.f16946L0);
        C4482n c4482n = this.f16947M0;
        C4489u c4489uM20328f2 = c4482n == null ? null : c4482n.m20328f2();
        if (c4489uM20328f2 != null) {
            bVar.m20257b(c4489uM20328f2.f16999f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.m20256a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f16948N0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f16949O0);
        bundle.putInt("INPUT_MODE_KEY", this.f16951Q0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f16952R0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f16953S0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f16954T0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f16955U0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f16956V0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f16957W0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f16958X0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f16959Y0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: S0 */
    public void mo12081S0() {
        super.mo12081S0();
        Window window = m12090c2().getWindow();
        if (this.f16950P0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f16963c1);
            m20347m2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m12147R().getDimensionPixelOffset(AbstractC6744e.f26341e0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f16963c1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC7610a(m12090c2(), rect));
        }
        m20338C2();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: T0 */
    public void mo5868T0() {
        this.f16945K0.m20411R1();
        super.mo5868T0();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h
    /* JADX INFO: renamed from: Y1 */
    public final Dialog mo7648Y1(Bundle bundle) {
        Dialog dialog = new Dialog(m12214y1(), m20352t2(m12214y1()));
        Context context = dialog.getContext();
        this.f16950P0 = m20354v2(context);
        int i7 = AbstractC6742c.f26286z;
        int i8 = AbstractC6751l.f26529C;
        this.f16963c1 = new C0622i(context, null, i7, i8);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC6752m.f26676K3, i7, i8);
        int color = typedArrayObtainStyledAttributes.getColor(AbstractC6752m.f26687L3, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f16963c1.m2710U(context);
        this.f16963c1.m2718g0(ColorStateList.valueOf(color));
        this.f16963c1.m2717f0(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    /* JADX INFO: renamed from: k2 */
    public boolean m20360k2(InterfaceC4487s interfaceC4487s) {
        return this.f16939E0.add(interfaceC4487s);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f16941G0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f16942H0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) m12161b0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: q2 */
    public String m20361q2() {
        return m20348n2().mo20281j(m12204u());
    }

    /* JADX INFO: renamed from: s2 */
    public final Object m20362s2() {
        return m20348n2().mo20279K();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: v0 */
    public final void mo681v0(Bundle bundle) {
        super.mo681v0(bundle);
        if (bundle == null) {
            bundle = m12199s();
        }
        this.f16943I0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f16944J0 = (InterfaceC4477i) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f16946L0 = (C4469a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC2263x.m9328a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f16948N0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f16949O0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f16951Q0 = bundle.getInt("INPUT_MODE_KEY");
        this.f16952R0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f16953S0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f16954T0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f16955U0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f16956V0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f16957W0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f16958X0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f16959Y0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f16949O0;
        if (text == null) {
            text = m12214y1().getResources().getText(this.f16948N0);
        }
        this.f16966f1 = text;
        this.f16967g1 = m20349o2(text);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public final View mo682z0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f16950P0 ? AbstractC6748i.f26450D : AbstractC6748i.f26449C, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f16950P0) {
            viewInflate.findViewById(AbstractC6746g.f26443z).setLayoutParams(new LinearLayout.LayoutParams(m20351r2(context), -2));
        } else {
            viewInflate.findViewById(AbstractC6746g.f26393A).setLayoutParams(new LinearLayout.LayoutParams(m20351r2(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(AbstractC6746g.f26399G);
        this.f16961a1 = textView;
        textView.setAccessibilityLiveRegion(1);
        this.f16962b1 = (CheckableImageButton) viewInflate.findViewById(AbstractC6746g.f26400H);
        this.f16960Z0 = (TextView) viewInflate.findViewById(AbstractC6746g.f26403K);
        m20353u2(context);
        this.f16964d1 = (Button) viewInflate.findViewById(AbstractC6746g.f26421d);
        if (m20348n2().mo20277F()) {
            this.f16964d1.setEnabled(true);
        } else {
            this.f16964d1.setEnabled(false);
        }
        this.f16964d1.setTag(f16936h1);
        CharSequence charSequence = this.f16953S0;
        if (charSequence != null) {
            this.f16964d1.setText(charSequence);
        } else {
            int i7 = this.f16952R0;
            if (i7 != 0) {
                this.f16964d1.setText(i7);
            }
        }
        CharSequence charSequence2 = this.f16955U0;
        if (charSequence2 != null) {
            this.f16964d1.setContentDescription(charSequence2);
        } else if (this.f16954T0 != 0) {
            this.f16964d1.setContentDescription(m12204u().getResources().getText(this.f16954T0));
        }
        this.f16964d1.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16933a.m20358A2(view);
            }
        });
        Button button = (Button) viewInflate.findViewById(AbstractC6746g.f26418a);
        button.setTag(f16937i1);
        CharSequence charSequence3 = this.f16957W0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i8 = this.f16956V0;
            if (i8 != 0) {
                button.setText(i8);
            }
        }
        CharSequence charSequence4 = this.f16959Y0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f16958X0 != 0) {
            button.setContentDescription(m12204u().getResources().getText(this.f16958X0));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16934a.m20363z2(view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: z2 */
    public void m20363z2(View view) {
        Iterator it = this.f16940F0.iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
        mo12082T1();
    }
}
