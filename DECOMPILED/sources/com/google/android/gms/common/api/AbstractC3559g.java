package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.common.api.internal.AbstractC3594d;
import com.google.android.gms.common.api.internal.AbstractC3612m;
import com.google.android.gms.common.api.internal.AbstractC3618p;
import com.google.android.gms.common.api.internal.AbstractC3620q;
import com.google.android.gms.common.api.internal.AbstractC3632w;
import com.google.android.gms.common.api.internal.AbstractC3636y;
import com.google.android.gms.common.api.internal.AbstractServiceConnectionC3614n;
import com.google.android.gms.common.api.internal.BinderC3597e0;
import com.google.android.gms.common.api.internal.C3565C;
import com.google.android.gms.common.api.internal.C3574L;
import com.google.android.gms.common.api.internal.C3579Q;
import com.google.android.gms.common.api.internal.C3588a;
import com.google.android.gms.common.api.internal.C3590b;
import com.google.android.gms.common.api.internal.C3600g;
import com.google.android.gms.common.api.internal.C3610l;
import com.google.android.gms.common.api.internal.InterfaceC3628u;
import com.google.android.gms.common.internal.AbstractC3686c;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.C3690e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.android.gms.common.api.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3559g {
    protected final C3600g zaa;
    private final Context zab;
    private final String zac;
    private final C3553a zad;
    private final C3553a.d zae;
    private final C3590b zaf;
    private final Looper zag;
    private final int zah;
    private final AbstractC3560h zai;
    private final InterfaceC3628u zaj;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.g$a */
    public static class a {

        /* JADX INFO: renamed from: c */
        public static final a f14540c = new C7680a().m17767a();

        /* JADX INFO: renamed from: a */
        public final InterfaceC3628u f14541a;

        /* JADX INFO: renamed from: b */
        public final Looper f14542b;

        /* JADX INFO: renamed from: com.google.android.gms.common.api.g$a$a, reason: collision with other inner class name */
        public static class C7680a {

            /* JADX INFO: renamed from: a */
            private InterfaceC3628u f14543a;

            /* JADX INFO: renamed from: b */
            private Looper f14544b;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a */
            public a m17767a() {
                if (this.f14543a == null) {
                    this.f14543a = new C3588a();
                }
                if (this.f14544b == null) {
                    this.f14544b = Looper.getMainLooper();
                }
                return new a(this.f14543a, this.f14544b);
            }

            /* JADX INFO: renamed from: b */
            public C7680a m17768b(Looper looper) {
                AbstractC3718s.m18084m(looper, "Looper must not be null.");
                this.f14544b = looper;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public C7680a m17769c(InterfaceC3628u interfaceC3628u) {
                AbstractC3718s.m18084m(interfaceC3628u, "StatusExceptionMapper must not be null.");
                this.f14543a = interfaceC3628u;
                return this;
            }
        }

        private a(InterfaceC3628u interfaceC3628u, Account account, Looper looper) {
            this.f14541a = interfaceC3628u;
            this.f14542b = looper;
        }
    }

    public AbstractC3559g(Activity activity, C3553a c3553a, C3553a.d dVar, a aVar) {
        this(activity, activity, c3553a, dVar, aVar);
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC3594d m17765b(int i7, AbstractC3594d abstractC3594d) {
        abstractC3594d.zak();
        this.zaa.m17890C(this, i7, abstractC3594d);
        return abstractC3594d;
    }

    /* JADX INFO: renamed from: c */
    private final Task m17766c(int i7, AbstractC3632w abstractC3632w) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.m17891D(this, i7, abstractC3632w, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public AbstractC3560h asGoogleApiClient() {
        return this.zai;
    }

    protected C3690e.a createClientSettingsBuilder() {
        C3690e.a aVar = new C3690e.a();
        aVar.m18019d(null);
        aVar.m18018c(Collections.EMPTY_SET);
        aVar.m18020e(this.zab.getClass().getName());
        aVar.m18017b(this.zab.getPackageName());
        return aVar;
    }

    protected Task<Boolean> disconnectService() {
        return this.zaa.m17902w(this);
    }

    public <A extends C3553a.b, T extends AbstractC3594d> T doBestEffortWrite(T t7) {
        m17765b(2, t7);
        return t7;
    }

    public <A extends C3553a.b, T extends AbstractC3594d> T doRead(T t7) {
        m17765b(0, t7);
        return t7;
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends C3553a.b, T extends AbstractC3618p, U extends AbstractC3636y> Task<Void> doRegisterEventListener(T t7, U u7) {
        AbstractC3718s.m18083l(t7);
        AbstractC3718s.m18083l(u7);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C3610l.a aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public <A extends C3553a.b, T extends AbstractC3594d> T doWrite(T t7) {
        m17765b(1, t7);
        return t7;
    }

    protected String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final C3590b getApiKey() {
        return this.zaf;
    }

    public C3553a.d getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    protected String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    protected String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> C3610l registerListener(L l7, String str) {
        return AbstractC3612m.m17931a(l7, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3553a.f zab(Looper looper, C3574L c3574l) {
        C3690e c3690eM18016a = createClientSettingsBuilder().m18016a();
        C3553a.f fVarBuildClient = ((C3553a.a) AbstractC3718s.m18083l(this.zad.m17748a())).buildClient(this.zab, looper, c3690eM18016a, (Object) this.zae, (AbstractC3560h.b) c3574l, (AbstractC3560h.c) c3574l);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (fVarBuildClient instanceof AbstractC3686c)) {
            ((AbstractC3686c) fVarBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(fVarBuildClient instanceof AbstractServiceConnectionC3614n)) {
            return fVarBuildClient;
        }
        AbstractC2263x.m9328a(fVarBuildClient);
        throw null;
    }

    public final BinderC3597e0 zac(Context context, Handler handler) {
        return new BinderC3597e0(context, handler, createClientSettingsBuilder().m18016a());
    }

    public AbstractC3559g(Activity activity, C3553a c3553a, C3553a.d dVar, InterfaceC3628u interfaceC3628u) {
        a.C7680a c7680a = new a.C7680a();
        c7680a.m17769c(interfaceC3628u);
        c7680a.m17768b(activity.getMainLooper());
        this(activity, c3553a, dVar, c7680a.m17767a());
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends C3553a.b> Task<TResult> doBestEffortWrite(AbstractC3632w abstractC3632w) {
        return m17766c(2, abstractC3632w);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends C3553a.b> Task<TResult> doRead(AbstractC3632w abstractC3632w) {
        return m17766c(0, abstractC3632w);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C3610l.a aVar, int i7) {
        AbstractC3718s.m18084m(aVar, "Listener key cannot be null.");
        return this.zaa.m17903x(this, aVar, i7);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends C3553a.b> Task<TResult> doWrite(AbstractC3632w abstractC3632w) {
        return m17766c(1, abstractC3632w);
    }

    private AbstractC3559g(Context context, Activity activity, C3553a c3553a, C3553a.d dVar, a aVar) {
        String apiFallbackAttributionTag;
        AbstractC3718s.m18084m(context, "Null context is not permitted.");
        AbstractC3718s.m18084m(c3553a, "Api must not be null.");
        AbstractC3718s.m18084m(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC3718s.m18084m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            apiFallbackAttributionTag = context.getAttributionTag();
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = c3553a;
        this.zae = dVar;
        this.zag = aVar.f14542b;
        C3590b c3590bM17855a = C3590b.m17855a(c3553a, dVar, apiFallbackAttributionTag);
        this.zaf = c3590bM17855a;
        this.zai = new C3579Q(this);
        C3600g c3600gM17886u = C3600g.m17886u(context2);
        this.zaa = c3600gM17886u;
        this.zah = c3600gM17886u.m17900l();
        this.zaj = aVar.f14541a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C3565C.m17791j(activity, c3600gM17886u, c3590bM17855a);
        }
        c3600gM17886u.m17895H(this);
    }

    @ResultIgnorabilityUnspecified
    public <A extends C3553a.b> Task<Void> doRegisterEventListener(AbstractC3620q abstractC3620q) {
        AbstractC3718s.m18083l(abstractC3620q);
        throw null;
    }

    public AbstractC3559g(Context context, C3553a c3553a, C3553a.d dVar, a aVar) {
        this(context, null, c3553a, dVar, aVar);
    }
}
