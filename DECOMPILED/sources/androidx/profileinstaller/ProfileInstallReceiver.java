package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.privacysandbox.ads.adservices.measurement.ExecutorC2688k;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    class C2725a implements AbstractC2733f.c {
        C2725a() {
        }

        @Override // androidx.profileinstaller.AbstractC2733f.c
        /* JADX INFO: renamed from: a */
        public void mo12842a(int i7, Object obj) {
            AbstractC2733f.f10688b.mo12842a(i7, obj);
        }

        @Override // androidx.profileinstaller.AbstractC2733f.c
        /* JADX INFO: renamed from: b */
        public void mo12843b(int i7, Object obj) {
            AbstractC2733f.f10688b.mo12843b(i7, obj);
            ProfileInstallReceiver.this.setResultCode(i7);
        }
    }

    /* JADX INFO: renamed from: a */
    static void m12841a(AbstractC2733f.c cVar) {
        Process.sendSignal(Process.myPid(), 10);
        cVar.mo12843b(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC2733f.m12897j(context, new ExecutorC2688k(), new C2725a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    AbstractC2733f.m12898k(context, new ExecutorC2688k(), new C2725a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        AbstractC2733f.m12890c(context, new ExecutorC2688k(), new C2725a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            m12841a(new C2725a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        C2725a c2725a = new C2725a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            AbstractC2728a.m12852b(context, c2725a);
        } else {
            c2725a.mo12843b(16, null);
        }
    }
}
