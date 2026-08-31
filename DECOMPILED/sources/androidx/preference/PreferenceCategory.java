package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import p025D.AbstractC0168k;
import p338r0.AbstractC6873c;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: V */
    public boolean mo12714V() {
        return !super.mo12753z();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: z */
    public boolean mo12753z() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0168k.m836a(context, AbstractC6873c.f27504e, R.attr.preferenceCategoryStyle));
    }
}
