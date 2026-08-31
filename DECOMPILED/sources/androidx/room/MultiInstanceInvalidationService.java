package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a */
    private int f11262a;

    /* JADX INFO: renamed from: b */
    private final Map f11263b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    private final RemoteCallbackList f11264c = new RemoteCallbackListC2802b();

    /* JADX INFO: renamed from: d */
    private final InterfaceC2804b.a f11265d = new BinderC2801a();

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$a */
    public static final class BinderC2801a extends InterfaceC2804b.a {
        BinderC2801a() {
        }

        @Override // androidx.room.InterfaceC2804b
        /* JADX INFO: renamed from: G0 */
        public void mo13930G0(InterfaceC2803a callback, int i7) {
            AbstractC6118n.m27187e(callback, "callback");
            RemoteCallbackList remoteCallbackListM13926a = MultiInstanceInvalidationService.this.m13926a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListM13926a) {
                multiInstanceInvalidationService.m13926a().unregister(callback);
            }
        }

        @Override // androidx.room.InterfaceC2804b
        /* JADX INFO: renamed from: x */
        public int mo13931x(InterfaceC2803a callback, String str) {
            AbstractC6118n.m27187e(callback, "callback");
            int i7 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList remoteCallbackListM13926a = MultiInstanceInvalidationService.this.m13926a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListM13926a) {
                try {
                    multiInstanceInvalidationService.m13929d(multiInstanceInvalidationService.m13928c() + 1);
                    int iM13928c = multiInstanceInvalidationService.m13928c();
                    if (multiInstanceInvalidationService.m13926a().register(callback, Integer.valueOf(iM13928c))) {
                        multiInstanceInvalidationService.m13927b().put(Integer.valueOf(iM13928c), str);
                        i7 = iM13928c;
                    } else {
                        multiInstanceInvalidationService.m13929d(multiInstanceInvalidationService.m13928c() - 1);
                        multiInstanceInvalidationService.m13928c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i7;
        }

        @Override // androidx.room.InterfaceC2804b
        /* JADX INFO: renamed from: z0 */
        public void mo13932z0(int i7, String[] tables) {
            AbstractC6118n.m27187e(tables, "tables");
            RemoteCallbackList remoteCallbackListM13926a = MultiInstanceInvalidationService.this.m13926a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListM13926a) {
                String str = (String) multiInstanceInvalidationService.m13927b().get(Integer.valueOf(i7));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.m13926a().beginBroadcast();
                for (int i8 = 0; i8 < iBeginBroadcast; i8++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.m13926a().getBroadcastCookie(i8);
                        AbstractC6118n.m27185c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.m13927b().get(num);
                        if (i7 != iIntValue && AbstractC6118n.m27183a(str, str2)) {
                            try {
                                ((InterfaceC2803a) multiInstanceInvalidationService.m13926a().getBroadcastItem(i8)).mo13934p(tables);
                            } catch (RemoteException e7) {
                                Log.w("ROOM", "Error invoking a remote callback", e7);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.m13926a().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.m13926a().finishBroadcast();
                C1444v c1444v = C1444v.f4971a;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$b */
    public static final class RemoteCallbackListC2802b extends RemoteCallbackList {
        RemoteCallbackListC2802b() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(InterfaceC2803a callback, Object cookie) {
            AbstractC6118n.m27187e(callback, "callback");
            AbstractC6118n.m27187e(cookie, "cookie");
            MultiInstanceInvalidationService.this.m13927b().remove((Integer) cookie);
        }
    }

    /* JADX INFO: renamed from: a */
    public final RemoteCallbackList m13926a() {
        return this.f11264c;
    }

    /* JADX INFO: renamed from: b */
    public final Map m13927b() {
        return this.f11263b;
    }

    /* JADX INFO: renamed from: c */
    public final int m13928c() {
        return this.f11262a;
    }

    /* JADX INFO: renamed from: d */
    public final void m13929d(int i7) {
        this.f11262a = i7;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC6118n.m27187e(intent, "intent");
        return this.f11265d;
    }
}
