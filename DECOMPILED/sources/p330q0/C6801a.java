package p330q0;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.appcompat.app.AbstractC2263x;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: q0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6801a {

    /* JADX INFO: renamed from: f */
    private static final Object f27363f = new Object();

    /* JADX INFO: renamed from: g */
    private static C6801a f27364g;

    /* JADX INFO: renamed from: a */
    private final Context f27365a;

    /* JADX INFO: renamed from: b */
    private final HashMap f27366b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final HashMap f27367c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final ArrayList f27368d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final Handler f27369e;

    /* JADX INFO: renamed from: q0.a$a */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C6801a.this.m29841a();
            }
        }
    }

    /* JADX INFO: renamed from: q0.a$b */
    private static final class b {

        /* JADX INFO: renamed from: a */
        final ArrayList f27371a;
    }

    private C6801a(Context context) {
        this.f27365a = context;
        this.f27369e = new a(context.getMainLooper());
    }

    /* JADX INFO: renamed from: b */
    public static C6801a m29840b(Context context) {
        C6801a c6801a;
        synchronized (f27363f) {
            try {
                if (f27364g == null) {
                    f27364g = new C6801a(context.getApplicationContext());
                }
                c6801a = f27364g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6801a;
    }

    /* JADX INFO: renamed from: a */
    void m29841a() {
        while (true) {
            synchronized (this.f27366b) {
                try {
                    int size = this.f27368d.size();
                    if (size <= 0) {
                        return;
                    }
                    b[] bVarArr = new b[size];
                    this.f27368d.toArray(bVarArr);
                    this.f27368d.clear();
                    for (int i7 = 0; i7 < size; i7++) {
                        b bVar = bVarArr[i7];
                        if (bVar.f27371a.size() > 0) {
                            AbstractC2263x.m9328a(bVar.f27371a.get(0));
                            throw null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m29842c(Intent intent) {
        synchronized (this.f27366b) {
            try {
                intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f27365a.getContentResolver());
                intent.getData();
                String scheme = intent.getScheme();
                intent.getCategories();
                boolean z7 = (intent.getFlags() & 8) != 0;
                if (z7) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f27367c.get(intent.getAction());
                if (arrayList != null) {
                    if (z7) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    if (arrayList.size() > 0) {
                        AbstractC2263x.m9328a(arrayList.get(0));
                        if (!z7) {
                            throw null;
                        }
                        new StringBuilder().append("Matching against filter ");
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }
}
