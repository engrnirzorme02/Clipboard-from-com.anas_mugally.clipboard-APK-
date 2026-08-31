package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;
import p025D.AbstractC0168k;
import p338r0.AbstractC6873c;
import p338r0.AbstractC6877g;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: U */
    private CharSequence[] f10559U;

    /* JADX INFO: renamed from: V */
    private CharSequence[] f10560V;

    /* JADX INFO: renamed from: W */
    private Set f10561W;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f10561W = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6877g.f27519D, i7, i8);
        this.f10559U = AbstractC0168k.m850o(typedArrayObtainStyledAttributes, AbstractC6877g.f27525G, AbstractC6877g.f27521E);
        this.f10560V = AbstractC0168k.m850o(typedArrayObtainStyledAttributes, AbstractC6877g.f27527H, AbstractC6877g.f27523F);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: I */
    protected Object mo12713I(TypedArray typedArray, int i7) {
        CharSequence[] textArray = typedArray.getTextArray(i7);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0168k.m836a(context, AbstractC6873c.f27501b, R.attr.dialogPreferenceStyle));
    }
}
