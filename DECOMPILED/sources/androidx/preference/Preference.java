package androidx.preference;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.common.api.C3553a;
import java.util.List;
import p025D.AbstractC0168k;
import p338r0.AbstractC6871a;
import p338r0.AbstractC6872b;
import p338r0.AbstractC6873c;
import p338r0.AbstractC6875e;
import p338r0.AbstractC6877g;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: A */
    private boolean f10562A;

    /* JADX INFO: renamed from: B */
    private boolean f10563B;

    /* JADX INFO: renamed from: C */
    private boolean f10564C;

    /* JADX INFO: renamed from: D */
    private boolean f10565D;

    /* JADX INFO: renamed from: E */
    private boolean f10566E;

    /* JADX INFO: renamed from: F */
    private boolean f10567F;

    /* JADX INFO: renamed from: G */
    private boolean f10568G;

    /* JADX INFO: renamed from: H */
    private boolean f10569H;

    /* JADX INFO: renamed from: I */
    private boolean f10570I;

    /* JADX INFO: renamed from: J */
    private int f10571J;

    /* JADX INFO: renamed from: K */
    private int f10572K;

    /* JADX INFO: renamed from: L */
    private List f10573L;

    /* JADX INFO: renamed from: M */
    private InterfaceC2672b f10574M;

    /* JADX INFO: renamed from: N */
    private final View.OnClickListener f10575N;

    /* JADX INFO: renamed from: a */
    private final Context f10576a;

    /* JADX INFO: renamed from: b */
    private int f10577b;

    /* JADX INFO: renamed from: c */
    private int f10578c;

    /* JADX INFO: renamed from: d */
    private CharSequence f10579d;

    /* JADX INFO: renamed from: e */
    private CharSequence f10580e;

    /* JADX INFO: renamed from: f */
    private int f10581f;

    /* JADX INFO: renamed from: r */
    private String f10582r;

    /* JADX INFO: renamed from: s */
    private Intent f10583s;

    /* JADX INFO: renamed from: t */
    private String f10584t;

    /* JADX INFO: renamed from: u */
    private boolean f10585u;

    /* JADX INFO: renamed from: v */
    private boolean f10586v;

    /* JADX INFO: renamed from: w */
    private boolean f10587w;

    /* JADX INFO: renamed from: x */
    private String f10588x;

    /* JADX INFO: renamed from: y */
    private Object f10589y;

    /* JADX INFO: renamed from: z */
    private boolean f10590z;

    /* JADX INFO: renamed from: androidx.preference.Preference$a */
    class ViewOnClickListenerC2671a implements View.OnClickListener {
        ViewOnClickListenerC2671a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.mo12708M(view);
        }
    }

    /* JADX INFO: renamed from: androidx.preference.Preference$b */
    public interface InterfaceC2672b {
        /* JADX INFO: renamed from: a */
        CharSequence mo12717a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f10577b = C3553a.e.API_PRIORITY_OTHER;
        this.f10578c = 0;
        this.f10585u = true;
        this.f10586v = true;
        this.f10587w = true;
        this.f10590z = true;
        this.f10562A = true;
        this.f10563B = true;
        this.f10564C = true;
        this.f10565D = true;
        this.f10567F = true;
        this.f10570I = true;
        int i9 = AbstractC6875e.f27511a;
        this.f10571J = i9;
        this.f10575N = new ViewOnClickListenerC2671a();
        this.f10576a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6877g.f27529I, i7, i8);
        this.f10581f = AbstractC0168k.m847l(typedArrayObtainStyledAttributes, AbstractC6877g.f27583g0, AbstractC6877g.f27531J, 0);
        this.f10582r = AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27589j0, AbstractC6877g.f27543P);
        this.f10579d = AbstractC0168k.m849n(typedArrayObtainStyledAttributes, AbstractC6877g.f27605r0, AbstractC6877g.f27539N);
        this.f10580e = AbstractC0168k.m849n(typedArrayObtainStyledAttributes, AbstractC6877g.f27603q0, AbstractC6877g.f27545Q);
        this.f10577b = AbstractC0168k.m839d(typedArrayObtainStyledAttributes, AbstractC6877g.f27593l0, AbstractC6877g.f27547R, C3553a.e.API_PRIORITY_OTHER);
        this.f10584t = AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27581f0, AbstractC6877g.f27557W);
        this.f10571J = AbstractC0168k.m847l(typedArrayObtainStyledAttributes, AbstractC6877g.f27591k0, AbstractC6877g.f27537M, i9);
        this.f10572K = AbstractC0168k.m847l(typedArrayObtainStyledAttributes, AbstractC6877g.f27607s0, AbstractC6877g.f27549S, 0);
        this.f10585u = AbstractC0168k.m837b(typedArrayObtainStyledAttributes, AbstractC6877g.f27578e0, AbstractC6877g.f27535L, true);
        this.f10586v = AbstractC0168k.m837b(typedArrayObtainStyledAttributes, AbstractC6877g.f27597n0, AbstractC6877g.f27541O, true);
        this.f10587w = AbstractC0168k.m837b(typedArrayObtainStyledAttributes, AbstractC6877g.f27595m0, AbstractC6877g.f27533K, true);
        this.f10588x = AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27572c0, AbstractC6877g.f27551T);
        int i10 = AbstractC6877g.f27563Z;
        this.f10564C = AbstractC0168k.m837b(typedArrayObtainStyledAttributes, i10, i10, this.f10586v);
        int i11 = AbstractC6877g.f27566a0;
        this.f10565D = AbstractC0168k.m837b(typedArrayObtainStyledAttributes, i11, i11, this.f10586v);
        int i12 = AbstractC6877g.f27569b0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f10589y = mo12713I(typedArrayObtainStyledAttributes, i12);
        } else {
            int i13 = AbstractC6877g.f27553U;
            if (typedArrayObtainStyledAttributes.hasValue(i13)) {
                this.f10589y = mo12713I(typedArrayObtainStyledAttributes, i13);
            }
        }
        this.f10570I = AbstractC0168k.m837b(typedArrayObtainStyledAttributes, AbstractC6877g.f27599o0, AbstractC6877g.f27555V, true);
        int i14 = AbstractC6877g.f27601p0;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i14);
        this.f10566E = zHasValue;
        if (zHasValue) {
            this.f10567F = AbstractC0168k.m837b(typedArrayObtainStyledAttributes, i14, AbstractC6877g.f27559X, true);
        }
        this.f10568G = AbstractC0168k.m837b(typedArrayObtainStyledAttributes, AbstractC6877g.f27585h0, AbstractC6877g.f27561Y, false);
        int i15 = AbstractC6877g.f27587i0;
        this.f10563B = AbstractC0168k.m837b(typedArrayObtainStyledAttributes, i15, i15, true);
        int i16 = AbstractC6877g.f27575d0;
        this.f10569H = AbstractC0168k.m837b(typedArrayObtainStyledAttributes, i16, i16, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: A */
    public boolean m12729A() {
        return this.f10586v;
    }

    /* JADX INFO: renamed from: B */
    protected void mo12711B() {
    }

    /* JADX INFO: renamed from: C */
    public void mo12730C(boolean z7) {
        List list = this.f10573L;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Preference) list.get(i7)).m12731F(this, z7);
        }
    }

    /* JADX INFO: renamed from: D */
    protected void mo12709D() {
    }

    /* JADX INFO: renamed from: F */
    public void m12731F(Preference preference, boolean z7) {
        if (this.f10590z == z7) {
            this.f10590z = !z7;
            mo12730C(mo12714V());
            mo12711B();
        }
    }

    /* JADX INFO: renamed from: I */
    protected Object mo12713I(TypedArray typedArray, int i7) {
        return null;
    }

    /* JADX INFO: renamed from: J */
    public void m12732J(Preference preference, boolean z7) {
        if (this.f10562A == z7) {
            this.f10562A = !z7;
            mo12730C(mo12714V());
            mo12711B();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m12733K() {
        if (mo12753z() && m12729A()) {
            mo12709D();
            m12749t();
            if (this.f10583s != null) {
                m12741h().startActivity(this.f10583s);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    protected void mo12708M(View view) {
        m12733K();
    }

    /* JADX INFO: renamed from: O */
    protected boolean m12734O(boolean z7) {
        if (!m12738W()) {
            return false;
        }
        if (z7 == m12745n(!z7)) {
            return true;
        }
        m12748q();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: P */
    protected boolean m12735P(int i7) {
        if (!m12738W()) {
            return false;
        }
        if (i7 == m12746o(~i7)) {
            return true;
        }
        m12748q();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: T */
    protected boolean m12736T(String str) {
        if (!m12738W()) {
            return false;
        }
        Object obj = null;
        if (TextUtils.equals(str, m12747p(null))) {
            return true;
        }
        m12748q();
        obj.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: U */
    public final void m12737U(InterfaceC2672b interfaceC2672b) {
        this.f10574M = interfaceC2672b;
        mo12711B();
    }

    /* JADX INFO: renamed from: V */
    public boolean mo12714V() {
        return !mo12753z();
    }

    /* JADX INFO: renamed from: W */
    protected boolean m12738W() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m12739c(Object obj) {
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i7 = this.f10577b;
        int i8 = preference.f10577b;
        if (i7 != i8) {
            return i7 - i8;
        }
        CharSequence charSequence = this.f10579d;
        CharSequence charSequence2 = preference.f10579d;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f10579d.toString());
    }

    /* JADX INFO: renamed from: h */
    public Context m12741h() {
        return this.f10576a;
    }

    /* JADX INFO: renamed from: j */
    StringBuilder m12742j() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequenceM12751x = m12751x();
        if (!TextUtils.isEmpty(charSequenceM12751x)) {
            sb.append(charSequenceM12751x);
            sb.append(' ');
        }
        CharSequence charSequenceMo12726v = mo12726v();
        if (!TextUtils.isEmpty(charSequenceMo12726v)) {
            sb.append(charSequenceMo12726v);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    /* JADX INFO: renamed from: k */
    public String m12743k() {
        return this.f10584t;
    }

    /* JADX INFO: renamed from: m */
    public Intent m12744m() {
        return this.f10583s;
    }

    /* JADX INFO: renamed from: n */
    protected boolean m12745n(boolean z7) {
        if (!m12738W()) {
            return z7;
        }
        m12748q();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: o */
    protected int m12746o(int i7) {
        if (!m12738W()) {
            return i7;
        }
        m12748q();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: p */
    protected String m12747p(String str) {
        if (!m12738W()) {
            return str;
        }
        m12748q();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public AbstractC6871a m12748q() {
        return null;
    }

    /* JADX INFO: renamed from: t */
    public AbstractC6872b m12749t() {
        return null;
    }

    public String toString() {
        return m12742j().toString();
    }

    /* JADX INFO: renamed from: v */
    public CharSequence mo12726v() {
        return m12750w() != null ? m12750w().mo12717a(this) : this.f10580e;
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC2672b m12750w() {
        return this.f10574M;
    }

    /* JADX INFO: renamed from: x */
    public CharSequence m12751x() {
        return this.f10579d;
    }

    /* JADX INFO: renamed from: y */
    public boolean m12752y() {
        return !TextUtils.isEmpty(this.f10582r);
    }

    /* JADX INFO: renamed from: z */
    public boolean mo12753z() {
        return this.f10585u && this.f10590z && this.f10562A;
    }

    public Preference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0168k.m836a(context, AbstractC6873c.f27506g, R.attr.preferenceStyle));
    }
}
