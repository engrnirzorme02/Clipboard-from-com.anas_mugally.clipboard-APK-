package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: O */
    protected boolean f10624O;

    /* JADX INFO: renamed from: P */
    private CharSequence f10625P;

    /* JADX INFO: renamed from: Q */
    private CharSequence f10626Q;

    /* JADX INFO: renamed from: R */
    private boolean f10627R;

    /* JADX INFO: renamed from: S */
    private boolean f10628S;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: D */
    protected void mo12709D() {
        super.mo12709D();
        boolean z7 = !m12770X();
        if (m12739c(Boolean.valueOf(z7))) {
            m12771Y(z7);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: I */
    protected Object mo12713I(TypedArray typedArray, int i7) {
        return Boolean.valueOf(typedArray.getBoolean(i7, false));
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: V */
    public boolean mo12714V() {
        boolean z7;
        if (this.f10628S) {
            z7 = this.f10624O;
        } else {
            z7 = !this.f10624O;
        }
        return z7 || super.mo12714V();
    }

    /* JADX INFO: renamed from: X */
    public boolean m12770X() {
        return this.f10624O;
    }

    /* JADX INFO: renamed from: Y */
    public void m12771Y(boolean z7) {
        boolean z8 = this.f10624O != z7;
        if (z8 || !this.f10627R) {
            this.f10624O = z7;
            this.f10627R = true;
            m12734O(z7);
            if (z8) {
                mo12730C(mo12714V());
                mo12711B();
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m12772Z(boolean z7) {
        this.f10628S = z7;
    }

    /* JADX INFO: renamed from: a0 */
    public void m12773a0(CharSequence charSequence) {
        this.f10626Q = charSequence;
        if (m12770X()) {
            return;
        }
        mo12711B();
    }

    /* JADX INFO: renamed from: b0 */
    public void m12774b0(CharSequence charSequence) {
        this.f10625P = charSequence;
        if (m12770X()) {
            mo12711B();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c0 */
    protected void m12775c0(View view) {
        boolean z7;
        int i7;
        CharSequence charSequenceMo12726v;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.f10624O || TextUtils.isEmpty(this.f10625P)) {
                if (this.f10624O || TextUtils.isEmpty(this.f10626Q)) {
                    z7 = true;
                } else {
                    textView.setText(this.f10626Q);
                }
                if (z7) {
                    charSequenceMo12726v = mo12726v();
                    if (!TextUtils.isEmpty(charSequenceMo12726v)) {
                        textView.setText(charSequenceMo12726v);
                        z7 = false;
                    }
                }
                i7 = z7 ? 8 : 0;
                if (i7 != textView.getVisibility()) {
                    textView.setVisibility(i7);
                }
            }
            textView.setText(this.f10625P);
            z7 = false;
            if (z7) {
                charSequenceMo12726v = mo12726v();
                if (!TextUtils.isEmpty(charSequenceMo12726v)) {
                    textView.setText(charSequenceMo12726v);
                    z7 = false;
                }
            }
            if (z7) {
            }
            if (i7 != textView.getVisibility()) {
                textView.setVisibility(i7);
            }
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
