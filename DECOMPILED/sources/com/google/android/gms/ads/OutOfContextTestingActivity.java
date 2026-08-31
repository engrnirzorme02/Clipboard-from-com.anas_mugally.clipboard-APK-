package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.InterfaceC3310X0;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.internal.ads.zzbot;
import p314o2.AbstractC6567s;
import p314o2.AbstractC6568t;

/* JADX INFO: loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC3310X0 interfaceC3310X0M17352h = C3244B.m17191b().m17352h(this, new zzbot());
        if (interfaceC3310X0M17352h == null) {
            finish();
            return;
        }
        setContentView(AbstractC6568t.f24763a);
        LinearLayout linearLayout = (LinearLayout) findViewById(AbstractC6567s.f24762a);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            interfaceC3310X0M17352h.zze(stringExtra, BinderC3773b.m18221N0(this), BinderC3773b.m18221N0(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
