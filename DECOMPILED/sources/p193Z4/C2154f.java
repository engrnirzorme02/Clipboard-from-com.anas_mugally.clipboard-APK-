package p193Z4;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p081K.AbstractC0724p;
import p164V3.C1762g;
import p178X3.InterfaceC1950a;
import p200a4.C2206E;
import p200a4.C2210c;
import p200a4.C2224q;
import p200a4.C2230w;
import p200a4.InterfaceC2211d;
import p200a4.InterfaceC2214g;
import p211b5.InterfaceC2972b;
import p285k5.InterfaceC6074i;

/* JADX INFO: renamed from: Z4.f */
/* JADX INFO: loaded from: classes.dex */
public class C2154f implements InterfaceC2157i, InterfaceC2158j {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2972b f7006a;

    /* JADX INFO: renamed from: b */
    private final Context f7007b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2972b f7008c;

    /* JADX INFO: renamed from: d */
    private final Set f7009d;

    /* JADX INFO: renamed from: e */
    private final Executor f7010e;

    private C2154f(final Context context, final String str, Set set, InterfaceC2972b interfaceC2972b, Executor executor) {
        this(new C2230w(new InterfaceC2972b() { // from class: Z4.c
            @Override // p211b5.InterfaceC2972b
            public final Object get() {
                return C2154f.m8757d(context, str);
            }
        }), set, executor, interfaceC2972b, context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m8756c(C2154f c2154f) {
        String string;
        synchronized (c2154f) {
            try {
                C2164p c2164p = (C2164p) c2154f.f7006a.get();
                List listM8778g = c2164p.m8778g();
                c2164p.m8777f();
                JSONArray jSONArray = new JSONArray();
                for (int i7 = 0; i7 < listM8778g.size(); i7++) {
                    AbstractC2165q abstractC2165q = (AbstractC2165q) listM8778g.get(i7);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", abstractC2165q.mo8755c());
                    jSONObject.put("dates", new JSONArray((Collection) abstractC2165q.mo8754b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C2164p m8757d(Context context, String str) {
        return new C2164p(context, str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C2154f m8758e(C2206E c2206e, InterfaceC2211d interfaceC2211d) {
        return new C2154f((Context) interfaceC2211d.mo8953a(Context.class), ((C1762g) interfaceC2211d.mo8953a(C1762g.class)).m7408q(), interfaceC2211d.m8989e(InterfaceC2155g.class), interfaceC2211d.mo8955c(InterfaceC6074i.class), (Executor) interfaceC2211d.mo8954b(c2206e));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Void m8759f(C2154f c2154f) {
        synchronized (c2154f) {
            ((C2164p) c2154f.f7006a.get()).m8783o(System.currentTimeMillis(), ((InterfaceC6074i) c2154f.f7008c.get()).mo27106a());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static C2210c m8760g() {
        final C2206E c2206eM8951a = C2206E.m8951a(InterfaceC1950a.class, Executor.class);
        return C2210c.m8966f(C2154f.class, InterfaceC2157i.class, InterfaceC2158j.class).m8983b(C2224q.m9033l(Context.class)).m8983b(C2224q.m9033l(C1762g.class)).m8983b(C2224q.m9036o(InterfaceC2155g.class)).m8983b(C2224q.m9035n(InterfaceC6074i.class)).m8983b(C2224q.m9032k(c2206eM8951a)).m8987f(new InterfaceC2214g() { // from class: Z4.b
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return C2154f.m8758e(c2206eM8951a, interfaceC2211d);
            }
        }).m8985d();
    }

    @Override // p193Z4.InterfaceC2157i
    /* JADX INFO: renamed from: a */
    public Task mo8761a() {
        return !AbstractC0724p.m3488a(this.f7007b) ? Tasks.forResult("") : Tasks.call(this.f7010e, new Callable() { // from class: Z4.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2154f.m8756c(this.f7004a);
            }
        });
    }

    @Override // p193Z4.InterfaceC2158j
    /* JADX INFO: renamed from: b */
    public synchronized InterfaceC2158j.a mo8762b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2164p c2164p = (C2164p) this.f7006a.get();
        if (!c2164p.m8781m(jCurrentTimeMillis)) {
            return InterfaceC2158j.a.NONE;
        }
        c2164p.m8780k();
        return InterfaceC2158j.a.GLOBAL;
    }

    /* JADX INFO: renamed from: h */
    public Task m8763h() {
        if (this.f7009d.size() > 0 && AbstractC0724p.m3488a(this.f7007b)) {
            return Tasks.call(this.f7010e, new Callable() { // from class: Z4.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C2154f.m8759f(this.f7005a);
                }
            });
        }
        return Tasks.forResult(null);
    }

    C2154f(InterfaceC2972b interfaceC2972b, Set set, Executor executor, InterfaceC2972b interfaceC2972b2, Context context) {
        this.f7006a = interfaceC2972b;
        this.f7009d = set;
        this.f7010e = executor;
        this.f7008c = interfaceC2972b2;
        this.f7007b = context;
    }
}
