package com.google.firebase.messaging;

import android.os.Bundle;
import androidx.collection.C2390a;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.messaging.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4982d {

    /* JADX INFO: renamed from: a */
    public static final long f18918a = TimeUnit.MINUTES.toMillis(3);

    /* JADX INFO: renamed from: com.google.firebase.messaging.d$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C2390a m22470a(Bundle bundle) {
            C2390a c2390a = new C2390a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c2390a.put(str, str2);
                    }
                }
            }
            return c2390a;
        }
    }
}
