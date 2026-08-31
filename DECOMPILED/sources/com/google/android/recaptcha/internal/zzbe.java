package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1440r;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1617O;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return AbstractC1617O.m6650d();
        }
    }

    private static final Map zzb() {
        Map mapK = AbstractC1610H.m6629k(AbstractC1440r.m6083a(0, zzqi.NET_CAPABILITY_MMS), AbstractC1440r.m6083a(1, zzqi.NET_CAPABILITY_SUPL), AbstractC1440r.m6083a(2, zzqi.NET_CAPABILITY_DUN), AbstractC1440r.m6083a(3, zzqi.NET_CAPABILITY_FOTA), AbstractC1440r.m6083a(4, zzqi.NET_CAPABILITY_IMS), AbstractC1440r.m6083a(5, zzqi.NET_CAPABILITY_CBS), AbstractC1440r.m6083a(6, zzqi.NET_CAPABILITY_WIFI_P2P), AbstractC1440r.m6083a(7, zzqi.NET_CAPABILITY_IA), AbstractC1440r.m6083a(8, zzqi.NET_CAPABILITY_RCS), AbstractC1440r.m6083a(9, zzqi.NET_CAPABILITY_XCAP), AbstractC1440r.m6083a(10, zzqi.NET_CAPABILITY_EIMS), AbstractC1440r.m6083a(11, zzqi.NET_CAPABILITY_NOT_METERED), AbstractC1440r.m6083a(12, zzqi.NET_CAPABILITY_INTERNET), AbstractC1440r.m6083a(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), AbstractC1440r.m6083a(14, zzqi.NET_CAPABILITY_TRUSTED), AbstractC1440r.m6083a(15, zzqi.NET_CAPABILITY_NOT_VPN));
        int i7 = Build.VERSION.SDK_INT;
        mapK.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        mapK.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        if (i7 >= 28) {
            mapK.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            mapK.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            mapK.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            mapK.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i7 >= 29) {
            mapK.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i7 >= 30) {
            mapK.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i7 >= 31) {
            mapK.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            mapK.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i7 >= 33) {
            mapK.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            mapK.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            mapK.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return mapK;
    }
}
