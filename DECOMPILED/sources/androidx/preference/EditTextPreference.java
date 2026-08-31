package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import p025D.AbstractC0168k;
import p338r0.AbstractC6873c;
import p338r0.AbstractC6876f;
import p338r0.AbstractC6877g;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: U */
    private String f10551U;

    /* JADX INFO: renamed from: androidx.preference.EditTextPreference$a */
    public static final class C2669a implements Preference.InterfaceC2672b {

        /* JADX INFO: renamed from: a */
        private static C2669a f10552a;

        private C2669a() {
        }

        /* JADX INFO: renamed from: b */
        public static C2669a m12716b() {
            if (f10552a == null) {
                f10552a = new C2669a();
            }
            return f10552a;
        }

        @Override // androidx.preference.Preference.InterfaceC2672b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence mo12717a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.m12715X()) ? editTextPreference.m12741h().getString(AbstractC6876f.f27512a) : editTextPreference.m12715X();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6877g.f27612v, i7, i8);
        int i9 = AbstractC6877g.f27614w;
        if (AbstractC0168k.m837b(typedArrayObtainStyledAttributes, i9, i9, false)) {
            m12737U(C2669a.m12716b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: I */
    protected Object mo12713I(TypedArray typedArray, int i7) {
        return typedArray.getString(i7);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: V */
    public boolean mo12714V() {
        return TextUtils.isEmpty(this.f10551U) || super.mo12714V();
    }

    /* JADX INFO: renamed from: X */
    public String m12715X() {
        return this.f10551U;
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0168k.m836a(context, AbstractC6873c.f27503d, R.attr.editTextPreferenceStyle));
    }
}
