package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC3598f;
import com.google.android.gms.common.api.internal.InterfaceC3616o;
import com.google.android.gms.common.internal.AbstractC3686c;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.C3690e;
import com.google.android.gms.common.internal.InterfaceC3702k;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p170W2.C1839d;

/* JADX INFO: renamed from: com.google.android.gms.common.api.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3553a {

    /* JADX INFO: renamed from: a */
    private final a f14524a;

    /* JADX INFO: renamed from: b */
    private final g f14525b;

    /* JADX INFO: renamed from: c */
    private final String f14526c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class a extends e {
        @Deprecated
        public f buildClient(Context context, Looper looper, C3690e c3690e, Object obj, AbstractC3560h.b bVar, AbstractC3560h.c cVar) {
            return buildClient(context, looper, c3690e, obj, (InterfaceC3598f) bVar, (InterfaceC3616o) cVar);
        }

        public f buildClient(Context context, Looper looper, C3690e c3690e, Object obj, InterfaceC3598f interfaceC3598f, InterfaceC3616o interfaceC3616o) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$b */
    public interface b {
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$c */
    public static class c {
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$d */
    public interface d {

        /* JADX INFO: renamed from: n */
        public static final a f14527n = new a(null);

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$d$a */
        public static final class a implements d {
            /* synthetic */ a(AbstractC3648r abstractC3648r) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class e {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(Object obj) {
            return Collections.EMPTY_LIST;
        }

        public int getPriority() {
            return API_PRIORITY_OTHER;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$f */
    public interface f extends b {
        void connect(AbstractC3686c.c cVar);

        void disconnect();

        void disconnect(String str);

        C1839d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(InterfaceC3702k interfaceC3702k, Set set);

        Set getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(AbstractC3686c.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$g */
    public static final class g extends c {
    }

    public C3553a(String str, a aVar, g gVar) {
        AbstractC3718s.m18084m(aVar, "Cannot construct an Api with a null ClientBuilder");
        AbstractC3718s.m18084m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f14526c = str;
        this.f14524a = aVar;
        this.f14525b = gVar;
    }

    /* JADX INFO: renamed from: a */
    public final a m17748a() {
        return this.f14524a;
    }

    /* JADX INFO: renamed from: b */
    public final c m17749b() {
        return this.f14525b;
    }

    /* JADX INFO: renamed from: c */
    public final String m17750c() {
        return this.f14526c;
    }
}
