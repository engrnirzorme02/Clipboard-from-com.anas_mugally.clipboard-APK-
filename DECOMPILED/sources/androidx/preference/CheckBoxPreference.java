package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import p025D.AbstractC0168k;
import p338r0.AbstractC6873c;
import p338r0.AbstractC6877g;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: T */
    private final C2667a f10538T;

    /* JADX INFO: renamed from: androidx.preference.CheckBoxPreference$a */
    private class C2667a implements CompoundButton.OnCheckedChangeListener {
        C2667a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
            if (CheckBoxPreference.this.m12739c(Boolean.valueOf(z7))) {
                CheckBoxPreference.this.m12771Y(z7);
            } else {
                compoundButton.setChecked(!z7);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    private void m12706d0(View view) {
        boolean z7 = view instanceof CompoundButton;
        if (z7) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f10624O);
        }
        if (z7) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f10538T);
        }
    }

    /* JADX INFO: renamed from: e0 */
    private void m12707e0(View view) {
        if (((AccessibilityManager) m12741h().getSystemService("accessibility")).isEnabled()) {
            m12706d0(view.findViewById(R.id.checkbox));
            m12775c0(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: M */
    protected void mo12708M(View view) {
        super.mo12708M(view);
        m12707e0(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f10538T = new C2667a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6877g.f27568b, i7, i8);
        m12774b0(AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27584h, AbstractC6877g.f27571c));
        m12773a0(AbstractC0168k.m848m(typedArrayObtainStyledAttributes, AbstractC6877g.f27582g, AbstractC6877g.f27574d));
        m12772Z(AbstractC0168k.m837b(typedArrayObtainStyledAttributes, AbstractC6877g.f27580f, AbstractC6877g.f27577e, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0168k.m836a(context, AbstractC6873c.f27500a, R.attr.checkBoxPreferenceStyle));
    }
}
