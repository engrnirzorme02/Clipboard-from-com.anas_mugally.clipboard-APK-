package p170W2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractC2599q;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: W2.m */
/* JADX INFO: loaded from: classes.dex */
public class C1848m extends DialogInterfaceOnCancelListenerC2590h {

    /* JADX INFO: renamed from: E0 */
    private Dialog f6001E0;

    /* JADX INFO: renamed from: F0 */
    private DialogInterface.OnCancelListener f6002F0;

    /* JADX INFO: renamed from: G0 */
    private Dialog f6003G0;

    /* JADX INFO: renamed from: h2 */
    public static C1848m m7647h2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C1848m c1848m = new C1848m();
        Dialog dialog2 = (Dialog) AbstractC3718s.m18084m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c1848m.f6001E0 = dialog2;
        if (onCancelListener != null) {
            c1848m.f6002F0 = onCancelListener;
        }
        return c1848m;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h
    /* JADX INFO: renamed from: Y1 */
    public Dialog mo7648Y1(Bundle bundle) {
        Dialog dialog = this.f6001E0;
        if (dialog != null) {
            return dialog;
        }
        m12092e2(false);
        if (this.f6003G0 == null) {
            this.f6003G0 = new AlertDialog.Builder((Context) AbstractC3718s.m18083l(m12204u())).create();
        }
        return this.f6003G0;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h
    /* JADX INFO: renamed from: g2 */
    public void mo7649g2(AbstractC2599q abstractC2599q, String str) {
        super.mo7649g2(abstractC2599q, str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6002F0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
