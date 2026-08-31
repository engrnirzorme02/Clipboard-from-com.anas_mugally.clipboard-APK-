package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C2256q;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.b */
/* JADX INFO: loaded from: classes2.dex */
public class C4428b extends C2256q {

    /* JADX INFO: renamed from: E0 */
    private boolean f16538E0;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.b$b */
    private class b extends BottomSheetBehavior.AbstractC4424g {
        private b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC4424g
        /* JADX INFO: renamed from: b */
        public void mo19685b(View view, float f7) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC4424g
        /* JADX INFO: renamed from: c */
        public void mo19686c(View view, int i7) {
            if (i7 == 5) {
                C4428b.this.m19709i2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public void m19709i2() {
        if (this.f16538E0) {
            super.mo12083U1();
        } else {
            super.mo12082T1();
        }
    }

    /* JADX INFO: renamed from: j2 */
    private void m19710j2(BottomSheetBehavior bottomSheetBehavior, boolean z7) {
        this.f16538E0 = z7;
        if (bottomSheetBehavior.m19680u0() == 5) {
            m19709i2();
            return;
        }
        if (m12085W1() instanceof DialogC4427a) {
            ((DialogC4427a) m12085W1()).m19704t();
        }
        bottomSheetBehavior.m19671c0(new b());
        bottomSheetBehavior.m19669Z0(5);
    }

    /* JADX INFO: renamed from: k2 */
    private boolean m19711k2(boolean z7) {
        Dialog dialogM12085W1 = m12085W1();
        if (!(dialogM12085W1 instanceof DialogC4427a)) {
            return false;
        }
        DialogC4427a dialogC4427a = (DialogC4427a) dialogM12085W1;
        BottomSheetBehavior bottomSheetBehaviorM19702q = dialogC4427a.m19702q();
        if (!bottomSheetBehaviorM19702q.m19651A0() || !dialogC4427a.m19703r()) {
            return false;
        }
        m19710j2(bottomSheetBehaviorM19702q, z7);
        return true;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h
    /* JADX INFO: renamed from: T1 */
    public void mo12082T1() {
        if (m19711k2(false)) {
            return;
        }
        super.mo12082T1();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h
    /* JADX INFO: renamed from: U1 */
    public void mo12083U1() {
        if (m19711k2(true)) {
            return;
        }
        super.mo12083U1();
    }

    @Override // androidx.appcompat.app.C2256q, androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h
    /* JADX INFO: renamed from: Y1 */
    public Dialog mo7648Y1(Bundle bundle) {
        return new DialogC4427a(m12204u(), m12086X1());
    }
}
