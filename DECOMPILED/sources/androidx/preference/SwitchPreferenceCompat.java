package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import p025D.AbstractC0168k;
import p338r0.AbstractC6873c;
import p338r0.AbstractC6874d;
import p338r0.AbstractC6877g;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* JADX INFO: renamed from: T */
    private final C2677a f10620T;

    /* JADX INFO: renamed from: U */
    private CharSequence f10621U;

    /* JADX INFO: renamed from: V */
    private CharSequence f10622V;

    /* JADX INFO: renamed from: androidx.preference.SwitchPreferenceCompat$a */
    private class C2677a implements CompoundButton.OnCheckedChangeListener {
        C2677a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
            if (SwitchPreferenceCompat.this.m12739c(Boolean.valueOf(z7))) {
                SwitchPreferenceCompat.this.m12771Y(z7);
            } else {
                compoundButton.setChecked(!z7);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f10620T = new C2677a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6877g.f27554U0, i7, i8);
        m12774b0(AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27573c1, AbstractC6877g.f27556V0));
        m12773a0(AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27570b1, AbstractC6877g.f27558W0));
        m12769e0(AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27579e1, AbstractC6877g.f27562Y0));
        m12768d0(AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27576d1, AbstractC6877g.f27564Z0));
        m12772Z(AbstractC0168k.m837b(typedArrayObtainStyledAttributes, AbstractC6877g.f27567a1, AbstractC6877g.f27560X0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    private void m12766f0(View view) {
        boolean z7 = view instanceof SwitchCompat;
        if (z7) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f10624O);
        }
        if (z7) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f10621U);
            switchCompat.setTextOff(this.f10622V);
            switchCompat.setOnCheckedChangeListener(this.f10620T);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private void m12767g0(View view) {
        if (((AccessibilityManager) m12741h().getSystemService("accessibility")).isEnabled()) {
            m12766f0(view.findViewById(AbstractC6874d.f27510a));
            m12775c0(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: M */
    protected void mo12708M(View view) {
        super.mo12708M(view);
        m12767g0(view);
    }

    /* JADX INFO: renamed from: d0 */
    public void m12768d0(CharSequence charSequence) {
        this.f10622V = charSequence;
        mo12711B();
    }

    /* JADX INFO: renamed from: e0 */
    public void m12769e0(CharSequence charSequence) {
        this.f10621U = charSequence;
        mo12711B();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6873c.f27508i);
    }
}
