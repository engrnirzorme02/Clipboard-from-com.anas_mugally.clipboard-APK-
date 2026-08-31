package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import p025D.AbstractC0168k;
import p338r0.AbstractC6873c;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: W */
    private boolean f10601W;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC0168k.m836a(context, AbstractC6873c.f27505f, R.attr.preferenceScreenStyle));
        this.f10601W = true;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: D */
    protected void mo12709D() {
        if (m12744m() == null && m12743k() == null && m12755Y() != 0) {
            m12749t();
            throw null;
        }
    }
}
