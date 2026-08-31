package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p025D.AbstractC0168k;
import p338r0.AbstractC6873c;
import p338r0.AbstractC6877g;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: O */
    private CharSequence f10540O;

    /* JADX INFO: renamed from: P */
    private CharSequence f10541P;

    /* JADX INFO: renamed from: Q */
    private Drawable f10542Q;

    /* JADX INFO: renamed from: R */
    private CharSequence f10543R;

    /* JADX INFO: renamed from: S */
    private CharSequence f10544S;

    /* JADX INFO: renamed from: T */
    private int f10545T;

    public DialogPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6877g.f27586i, i7, i8);
        String strM848m = AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27606s, AbstractC6877g.f27588j);
        this.f10540O = strM848m;
        if (strM848m == null) {
            this.f10540O = m12751x();
        }
        this.f10541P = AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27604r, AbstractC6877g.f27590k);
        this.f10542Q = AbstractC0168k.m838c(typedArrayObtainStyledAttributes, AbstractC6877g.f27600p, AbstractC6877g.f27592l);
        this.f10543R = AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27610u, AbstractC6877g.f27594m);
        this.f10544S = AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27608t, AbstractC6877g.f27596n);
        this.f10545T = AbstractC0168k.m847l(typedArrayObtainStyledAttributes, AbstractC6877g.f27602q, AbstractC6877g.f27598o, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: D */
    protected void mo12709D() {
        m12749t();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0168k.m836a(context, AbstractC6873c.f27501b, R.attr.dialogPreferenceStyle));
    }
}
