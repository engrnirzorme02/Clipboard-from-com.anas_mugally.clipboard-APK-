package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p216c2.AbstractC3000p;
import p216c2.C3005u;
import p306n2.AbstractC6482a;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m17164a() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i7 = intent.getExtras().getInt("attemptNumber");
        C3005u.m14973f(context);
        AbstractC3000p.a aVarMo14935d = AbstractC3000p.m14964a().mo14933b(queryParameter).mo14935d(AbstractC6482a.m27650b(iIntValue));
        if (queryParameter2 != null) {
            aVarMo14935d.mo14934c(Base64.decode(queryParameter2, 0));
        }
        C3005u.m14971c().m14974e().m26266m(aVarMo14935d.mo14932a(), i7, new Runnable() { // from class: j2.a
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m17164a();
            }
        });
    }
}
