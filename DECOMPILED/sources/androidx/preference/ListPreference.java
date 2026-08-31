package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import p025D.AbstractC0168k;
import p338r0.AbstractC6873c;
import p338r0.AbstractC6876f;
import p338r0.AbstractC6877g;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: U */
    private CharSequence[] f10553U;

    /* JADX INFO: renamed from: V */
    private CharSequence[] f10554V;

    /* JADX INFO: renamed from: W */
    private String f10555W;

    /* JADX INFO: renamed from: X */
    private String f10556X;

    /* JADX INFO: renamed from: Y */
    private boolean f10557Y;

    /* JADX INFO: renamed from: androidx.preference.ListPreference$a */
    public static final class C2670a implements Preference.InterfaceC2672b {

        /* JADX INFO: renamed from: a */
        private static C2670a f10558a;

        private C2670a() {
        }

        /* JADX INFO: renamed from: b */
        public static C2670a m12727b() {
            if (f10558a == null) {
                f10558a = new C2670a();
            }
            return f10558a;
        }

        @Override // androidx.preference.Preference.InterfaceC2672b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence mo12717a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.m12722Z()) ? listPreference.m12741h().getString(AbstractC6876f.f27512a) : listPreference.m12722Z();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6877g.f27616x, i7, i8);
        this.f10553U = AbstractC0168k.m850o(typedArrayObtainStyledAttributes, AbstractC6877g.f27513A, AbstractC6877g.f27618y);
        this.f10554V = AbstractC0168k.m850o(typedArrayObtainStyledAttributes, AbstractC6877g.f27515B, AbstractC6877g.f27620z);
        int i9 = AbstractC6877g.f27517C;
        if (AbstractC0168k.m837b(typedArrayObtainStyledAttributes, i9, i9, false)) {
            m12737U(C2670a.m12727b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC6877g.f27529I, i7, i8);
        this.f10556X = AbstractC0168k.m848m(typedArrayObtainStyledAttributes2, AbstractC6877g.f27603q0, AbstractC6877g.f27545Q);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: c0 */
    private int m12719c0() {
        return m12720X(this.f10555W);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: I */
    protected Object mo12713I(TypedArray typedArray, int i7) {
        return typedArray.getString(i7);
    }

    /* JADX INFO: renamed from: X */
    public int m12720X(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f10554V) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f10554V[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: Y */
    public CharSequence[] m12721Y() {
        return this.f10553U;
    }

    /* JADX INFO: renamed from: Z */
    public CharSequence m12722Z() {
        CharSequence[] charSequenceArr;
        int iM12719c0 = m12719c0();
        if (iM12719c0 < 0 || (charSequenceArr = this.f10553U) == null) {
            return null;
        }
        return charSequenceArr[iM12719c0];
    }

    /* JADX INFO: renamed from: a0 */
    public CharSequence[] m12723a0() {
        return this.f10554V;
    }

    /* JADX INFO: renamed from: b0 */
    public String m12724b0() {
        return this.f10555W;
    }

    /* JADX INFO: renamed from: d0 */
    public void m12725d0(String str) {
        boolean zEquals = TextUtils.equals(this.f10555W, str);
        if (zEquals && this.f10557Y) {
            return;
        }
        this.f10555W = str;
        this.f10557Y = true;
        m12736T(str);
        if (zEquals) {
            return;
        }
        mo12711B();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: v */
    public CharSequence mo12726v() {
        if (m12750w() != null) {
            return m12750w().mo12717a(this);
        }
        CharSequence charSequenceM12722Z = m12722Z();
        CharSequence charSequenceMo12726v = super.mo12726v();
        String str = this.f10556X;
        if (str != null) {
            if (charSequenceM12722Z == null) {
                charSequenceM12722Z = "";
            }
            String str2 = String.format(str, charSequenceM12722Z);
            if (!TextUtils.equals(str2, charSequenceMo12726v)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceMo12726v;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0168k.m836a(context, AbstractC6873c.f27501b, R.attr.dialogPreferenceStyle));
    }
}
