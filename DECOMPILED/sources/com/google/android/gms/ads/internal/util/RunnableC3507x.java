package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.x */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC3507x implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f14343a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f14344b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ boolean f14345c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ boolean f14346d;

    RunnableC3507x(C3509y c3509y, Context context, String str, boolean z7, boolean z8) {
        this.f14343a = context;
        this.f14344b = str;
        this.f14345c = z7;
        this.f14346d = z8;
        Objects.requireNonNull(c3509y);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7351t.m32349g();
        Context context = this.f14343a;
        AlertDialog.Builder builderM17424o = C3431F0.m17424o(context);
        builderM17424o.setMessage(this.f14344b);
        if (this.f14345c) {
            builderM17424o.setTitle("Error");
        } else {
            builderM17424o.setTitle("Info");
        }
        if (this.f14346d) {
            builderM17424o.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderM17424o.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC3505w(this, context));
            builderM17424o.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderM17424o.create().show();
    }
}
