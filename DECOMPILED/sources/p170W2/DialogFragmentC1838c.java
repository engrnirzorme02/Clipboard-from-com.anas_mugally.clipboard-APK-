package p170W2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: W2.c */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC1838c extends DialogFragment {

    /* JADX INFO: renamed from: a */
    private Dialog f5977a;

    /* JADX INFO: renamed from: b */
    private DialogInterface.OnCancelListener f5978b;

    /* JADX INFO: renamed from: c */
    private Dialog f5979c;

    /* JADX INFO: renamed from: a */
    public static DialogFragmentC1838c m7601a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC1838c dialogFragmentC1838c = new DialogFragmentC1838c();
        Dialog dialog2 = (Dialog) AbstractC3718s.m18084m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC1838c.f5977a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC1838c.f5978b = onCancelListener;
        }
        return dialogFragmentC1838c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f5978b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f5977a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f5979c == null) {
            this.f5979c = new AlertDialog.Builder((Context) AbstractC3718s.m18083l(getActivity())).create();
        }
        return this.f5979c;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
