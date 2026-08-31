package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC3608k;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC3664H implements DialogInterface.OnClickListener {
    /* JADX INFO: renamed from: b */
    public static AbstractDialogInterfaceOnClickListenerC3664H m17983b(Activity activity, Intent intent, int i7) {
        return new C3662F(intent, activity, i7);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractDialogInterfaceOnClickListenerC3664H m17984c(InterfaceC3608k interfaceC3608k, Intent intent, int i7) {
        return new C3663G(intent, interfaceC3608k, 2);
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo17982a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            try {
                mo17982a();
            } catch (ActivityNotFoundException e7) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e7);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
