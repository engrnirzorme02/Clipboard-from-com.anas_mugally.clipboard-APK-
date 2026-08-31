package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import p025D.AbstractC0168k;
import p338r0.AbstractC6873c;
import p338r0.AbstractC6877g;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: T */
    private final C2676a f10616T;

    /* JADX INFO: renamed from: U */
    private CharSequence f10617U;

    /* JADX INFO: renamed from: V */
    private CharSequence f10618V;

    /* JADX INFO: renamed from: androidx.preference.SwitchPreference$a */
    private class C2676a implements CompoundButton.OnCheckedChangeListener {
        C2676a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
            if (SwitchPreference.this.m12739c(Boolean.valueOf(z7))) {
                SwitchPreference.this.m12771Y(z7);
            } else {
                compoundButton.setChecked(!z7);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f10616T = new C2676a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6877g.f27532J0, i7, i8);
        m12774b0(AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27548R0, AbstractC6877g.f27534K0));
        m12773a0(AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27546Q0, AbstractC6877g.f27536L0));
        m12765e0(AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27552T0, AbstractC6877g.f27540N0));
        m12764d0(AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27550S0, AbstractC6877g.f27542O0));
        m12772Z(AbstractC0168k.m837b(typedArrayObtainStyledAttributes, AbstractC6877g.f27544P0, AbstractC6877g.f27538M0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    private void m12762f0(View view) {
        boolean z7 = view instanceof Switch;
        if (z7) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f10624O);
        }
        if (z7) {
            Switch r7 = (Switch) view;
            r7.setTextOn(this.f10617U);
            r7.setTextOff(this.f10618V);
            r7.setOnCheckedChangeListener(this.f10616T);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private void m12763g0(View view) {
        if (((AccessibilityManager) m12741h().getSystemService("accessibility")).isEnabled()) {
            m12762f0(view.findViewById(R.id.switch_widget));
            m12775c0(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: M */
    protected void mo12708M(View view) {
        super.mo12708M(view);
        m12763g0(view);
    }

    /* JADX INFO: renamed from: d0 */
    public void m12764d0(CharSequence charSequence) {
        this.f10618V = charSequence;
        mo12711B();
    }

    /* JADX INFO: renamed from: e0 */
    public void m12765e0(CharSequence charSequence) {
        this.f10617U = charSequence;
        mo12711B();
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0168k.m836a(context, AbstractC6873c.f27509j, R.attr.switchPreferenceStyle));
    }
}
