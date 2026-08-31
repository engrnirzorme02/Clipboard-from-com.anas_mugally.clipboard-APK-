package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h;

/* JADX INFO: renamed from: androidx.appcompat.app.q */
/* JADX INFO: loaded from: classes.dex */
public class C2256q extends DialogInterfaceOnCancelListenerC2590h {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h
    /* JADX INFO: renamed from: Y1 */
    public Dialog mo7648Y1(Bundle bundle) {
        return new DialogC2255p(m12204u(), m12086X1());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h
    /* JADX INFO: renamed from: f2 */
    public void mo9288f2(Dialog dialog, int i7) {
        if (!(dialog instanceof DialogC2255p)) {
            super.mo9288f2(dialog, i7);
            return;
        }
        DialogC2255p dialogC2255p = (DialogC2255p) dialog;
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC2255p.m9287j(1);
    }
}
