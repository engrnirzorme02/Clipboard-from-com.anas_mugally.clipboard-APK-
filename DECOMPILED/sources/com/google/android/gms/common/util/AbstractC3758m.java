package com.google.android.gms.common.util;

import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.util.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3758m {
    /* JADX INFO: renamed from: a */
    public static void m18191a(StringBuilder sb, HashMap map) {
        sb.append("{");
        boolean z7 = true;
        for (String str : map.keySet()) {
            if (!z7) {
                sb.append(",");
            }
            String str2 = (String) map.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z7 = false;
        }
        sb.append("}");
    }
}
