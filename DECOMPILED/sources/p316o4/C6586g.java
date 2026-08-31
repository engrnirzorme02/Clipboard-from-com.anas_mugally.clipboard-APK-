package p316o4;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p228d4.C5235g;
import p252g4.AbstractC5499i;
import p252g4.C5465C;
import p252g4.C5470H;
import p252g4.C5489a0;
import p252g4.EnumC5466D;
import p252g4.InterfaceC5464B;
import p260h4.C5653i;
import p292l4.C6297b;
import p300m4.C6346g;

/* JADX INFO: renamed from: o4.g */
/* JADX INFO: loaded from: classes.dex */
public class C6586g implements InterfaceC6589j {

    /* JADX INFO: renamed from: a */
    private final Context f24841a;

    /* JADX INFO: renamed from: b */
    private final C6590k f24842b;

    /* JADX INFO: renamed from: c */
    private final C6587h f24843c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5464B f24844d;

    /* JADX INFO: renamed from: e */
    private final C6580a f24845e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC6591l f24846f;

    /* JADX INFO: renamed from: g */
    private final C5465C f24847g;

    /* JADX INFO: renamed from: h */
    private final AtomicReference f24848h;

    /* JADX INFO: renamed from: i */
    private final AtomicReference f24849i;

    /* JADX INFO: renamed from: o4.g$a */
    class a implements SuccessContinuation {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C5653i f24850a;

        a(C5653i c5653i) {
            this.f24850a = c5653i;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task then(Void r7) throws Throwable {
            JSONObject jSONObject = (JSONObject) this.f24850a.f21643d.m25131c().submit(new Callable() { // from class: o4.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C6586g.a aVar = this.f24840a;
                    return C6586g.this.f24846f.mo27899a(C6586g.this.f24842b, true);
                }
            }).get();
            if (jSONObject != null) {
                C6583d c6583dM27926b = C6586g.this.f24843c.m27926b(jSONObject);
                C6586g.this.f24845e.m27892c(c6583dM27926b.f24825c, jSONObject);
                C6586g.this.m27916q(jSONObject, "Loaded settings: ");
                C6586g c6586g = C6586g.this;
                c6586g.m27917r(c6586g.f24842b.f24858f);
                C6586g.this.f24848h.set(c6583dM27926b);
                ((TaskCompletionSource) C6586g.this.f24849i.get()).trySetResult(c6583dM27926b);
            }
            return Tasks.forResult(null);
        }
    }

    C6586g(Context context, C6590k c6590k, InterfaceC5464B interfaceC5464B, C6587h c6587h, C6580a c6580a, InterfaceC6591l interfaceC6591l, C5465C c5465c) {
        AtomicReference atomicReference = new AtomicReference();
        this.f24848h = atomicReference;
        this.f24849i = new AtomicReference(new TaskCompletionSource());
        this.f24841a = context;
        this.f24842b = c6590k;
        this.f24844d = interfaceC5464B;
        this.f24843c = c6587h;
        this.f24845e = c6580a;
        this.f24846f = interfaceC6591l;
        this.f24847g = c5465c;
        atomicReference.set(C6581b.m27893b(interfaceC5464B));
    }

    /* JADX INFO: renamed from: l */
    public static C6586g m27913l(Context context, String str, C5470H c5470h, C6297b c6297b, String str2, String str3, C6346g c6346g, C5465C c5465c) {
        String strM24708g = c5470h.m24708g();
        C5489a0 c5489a0 = new C5489a0();
        return new C6586g(context, new C6590k(str, c5470h.m24709h(), c5470h.m24710i(), c5470h.m24711j(), c5470h, AbstractC5499i.m24790h(AbstractC5499i.m24795m(context), str, str3, str2), str3, str2, EnumC5466D.m24684d(strM24708g).m24685h()), c5489a0, new C6587h(c5489a0), new C6580a(c6346g), new C6582c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), c6297b), c5465c);
    }

    /* JADX INFO: renamed from: m */
    private C6583d m27914m(EnumC6584e enumC6584e) throws Throwable {
        C6583d c6583d = null;
        try {
            if (!EnumC6584e.SKIP_CACHE_LOOKUP.equals(enumC6584e)) {
                JSONObject jSONObjectM27891b = this.f24845e.m27891b();
                if (jSONObjectM27891b != null) {
                    C6583d c6583dM27926b = this.f24843c.m27926b(jSONObjectM27891b);
                    if (c6583dM27926b == null) {
                        C5235g.m24179f().m24183e("Failed to parse cached settings data.", null);
                        return null;
                    }
                    m27916q(jSONObjectM27891b, "Loaded cached settings: ");
                    long jMo24673a = this.f24844d.mo24673a();
                    if (!EnumC6584e.IGNORE_CACHE_EXPIRATION.equals(enumC6584e) && c6583dM27926b.m27903a(jMo24673a)) {
                        C5235g.m24179f().m24186i("Cached settings have expired.");
                        return null;
                    }
                    try {
                        C5235g.m24179f().m24186i("Returning cached settings.");
                        return c6583dM27926b;
                    } catch (Exception e7) {
                        e = e7;
                        c6583d = c6583dM27926b;
                        C5235g.m24179f().m24183e("Failed to get cached settings", e);
                        return c6583d;
                    }
                }
                C5235g.m24179f().m24180b("No cached settings data found.");
            }
            return null;
        } catch (Exception e8) {
            e = e8;
        }
    }

    /* JADX INFO: renamed from: n */
    private String m27915n() {
        return AbstractC5499i.m24799q(this.f24841a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m27916q(JSONObject jSONObject, String str) {
        C5235g.m24179f().m24180b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public boolean m27917r(String str) {
        SharedPreferences.Editor editorEdit = AbstractC5499i.m24799q(this.f24841a).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // p316o4.InterfaceC6589j
    /* JADX INFO: renamed from: a */
    public Task mo27918a() {
        return ((TaskCompletionSource) this.f24849i.get()).getTask();
    }

    @Override // p316o4.InterfaceC6589j
    /* JADX INFO: renamed from: b */
    public C6583d mo27919b() {
        return (C6583d) this.f24848h.get();
    }

    /* JADX INFO: renamed from: k */
    boolean m27920k() {
        return !m27915n().equals(this.f24842b.f24858f);
    }

    /* JADX INFO: renamed from: o */
    public Task m27921o(C5653i c5653i) {
        return m27922p(EnumC6584e.USE_CACHE, c5653i);
    }

    /* JADX INFO: renamed from: p */
    public Task m27922p(EnumC6584e enumC6584e, C5653i c5653i) throws Throwable {
        C6583d c6583dM27914m;
        if (!m27920k() && (c6583dM27914m = m27914m(enumC6584e)) != null) {
            this.f24848h.set(c6583dM27914m);
            ((TaskCompletionSource) this.f24849i.get()).trySetResult(c6583dM27914m);
            return Tasks.forResult(null);
        }
        C6583d c6583dM27914m2 = m27914m(EnumC6584e.IGNORE_CACHE_EXPIRATION);
        if (c6583dM27914m2 != null) {
            this.f24848h.set(c6583dM27914m2);
            ((TaskCompletionSource) this.f24849i.get()).trySetResult(c6583dM27914m2);
        }
        return this.f24847g.m24682i().onSuccessTask(c5653i.f21640a, new a(c5653i));
    }
}
