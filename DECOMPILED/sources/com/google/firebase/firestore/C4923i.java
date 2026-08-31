package com.google.firebase.firestore;

import android.app.Activity;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p137R4.AbstractC1357d;
import p137R4.C1343K;
import p137R4.C1344L;
import p137R4.C1353V;
import p137R4.C1361h;
import p137R4.C1368o;
import p137R4.C1379z;
import p158U4.C1687k;
import p158U4.C1696t;
import p158U4.InterfaceC1684h;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2044l;
import p186Y4.AbstractC2051s;
import p186Y4.InterfaceC2047o;

/* JADX INFO: renamed from: com.google.firebase.firestore.i */
/* JADX INFO: loaded from: classes.dex */
public class C4923i {

    /* JADX INFO: renamed from: a */
    private final C1687k f18673a;

    /* JADX INFO: renamed from: b */
    private final FirebaseFirestore f18674b;

    C4923i(C1687k c1687k, FirebaseFirestore firebaseFirestore) {
        this.f18673a = (C1687k) AbstractC2051s.m8520a(c1687k);
        this.f18674b = firebaseFirestore;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m22153a(C1361h c1361h, C1379z c1379z, C1344L c1344l) {
        c1361h.m5871c();
        c1379z.m5942m(c1344l);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4924j m22154b(C4923i c4923i, Task task) {
        c4923i.getClass();
        InterfaceC1684h interfaceC1684h = (InterfaceC1684h) task.getResult();
        return new C4924j(c4923i.f18674b, c4923i.f18673a, interfaceC1684h, true, interfaceC1684h != null && interfaceC1684h.mo7075d());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC4935u m22155c(C1343K c1343k, C1368o.b bVar, final C1361h c1361h, Activity activity, final C1379z c1379z) {
        final C1344L c1344lM5941l = c1379z.m5941l(c1343k, bVar, c1361h);
        return AbstractC1357d.m5862c(activity, new InterfaceC4935u() { // from class: com.google.firebase.firestore.h
            @Override // com.google.firebase.firestore.InterfaceC4935u
            public final void remove() {
                C4923i.m22153a(c1361h, c1379z, c1344lM5941l);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m22156d(C4923i c4923i, InterfaceC4925k interfaceC4925k, C1353V c1353v, C4928n c4928n) {
        c4923i.getClass();
        if (c4928n != null) {
            interfaceC4925k.mo5870a(null, c4928n);
            return;
        }
        AbstractC2034b.m8460d(c1353v != null, "Got event without value or error set", new Object[0]);
        AbstractC2034b.m8460d(c1353v.m5852e().size() <= 1, "Too many documents returned on a document query", new Object[0]);
        InterfaceC1684h interfaceC1684hM7100g = c1353v.m5852e().m7100g(c4923i.f18673a);
        interfaceC4925k.mo5870a(interfaceC1684hM7100g != null ? C4924j.m22165b(c4923i.f18674b, interfaceC1684hM7100g, c1353v.m5858k(), c1353v.m5853f().contains(interfaceC1684hM7100g.getKey())) : C4924j.m22166c(c4923i.f18674b, c4923i.f18673a, c1353v.m5858k()), null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m22158f(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, EnumC4939y enumC4939y, C4924j c4924j, C4928n c4928n) {
        if (c4928n != null) {
            taskCompletionSource.setException(c4928n);
            return;
        }
        try {
            ((InterfaceC4935u) Tasks.await(taskCompletionSource2.getTask())).remove();
            if (!c4924j.m22167a() && c4924j.m22170f().m22193a()) {
                taskCompletionSource.setException(new C4928n("Failed to get document because the client is offline.", C4928n.a.UNAVAILABLE));
            } else if (c4924j.m22167a() && c4924j.m22170f().m22193a() && enumC4939y == EnumC4939y.SERVER) {
                taskCompletionSource.setException(new C4928n("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", C4928n.a.UNAVAILABLE));
            } else {
                taskCompletionSource.setResult(c4924j);
            }
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            throw AbstractC2034b.m8458b(e7, "Failed to register a listener for a single document", new Object[0]);
        } catch (ExecutionException e8) {
            throw AbstractC2034b.m8458b(e8, "Failed to register a listener for a single document", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: g */
    private InterfaceC4935u m22159g(Executor executor, final C1368o.b bVar, final Activity activity, final InterfaceC4925k interfaceC4925k) {
        final C1361h c1361h = new C1361h(executor, new InterfaceC4925k() { // from class: com.google.firebase.firestore.f
            @Override // com.google.firebase.firestore.InterfaceC4925k
            /* JADX INFO: renamed from: a */
            public final void mo5870a(Object obj, C4928n c4928n) {
                C4923i.m22156d(this.f18664a, interfaceC4925k, (C1353V) obj, c4928n);
            }
        });
        final C1343K c1343kM22160h = m22160h();
        return (InterfaceC4935u) this.f18674b.m22146b(new InterfaceC2047o() { // from class: com.google.firebase.firestore.g
            @Override // p186Y4.InterfaceC2047o
            public final Object apply(Object obj) {
                return C4923i.m22155c(c1343kM22160h, bVar, c1361h, activity, (C1379z) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    private C1343K m22160h() {
        return C1343K.m5744b(this.f18673a.m7095t());
    }

    /* JADX INFO: renamed from: i */
    static C4923i m22161i(C1696t c1696t, FirebaseFirestore firebaseFirestore) {
        if (c1696t.m7063v() % 2 == 0) {
            return new C4923i(C1687k.m7088m(c1696t), firebaseFirestore);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + c1696t.mo7057h() + " has " + c1696t.m7063v());
    }

    /* JADX INFO: renamed from: l */
    private Task m22162l(final EnumC4939y enumC4939y) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        C1368o.b bVar = new C1368o.b();
        bVar.f4819a = true;
        bVar.f4820b = true;
        bVar.f4821c = true;
        taskCompletionSource2.setResult(m22159g(AbstractC2044l.f6763b, bVar, null, new InterfaceC4925k() { // from class: com.google.firebase.firestore.e
            @Override // com.google.firebase.firestore.InterfaceC4925k
            /* JADX INFO: renamed from: a */
            public final void mo5870a(Object obj, C4928n c4928n) {
                C4923i.m22158f(taskCompletionSource, taskCompletionSource2, enumC4939y, (C4924j) obj, c4928n);
            }
        }));
        return taskCompletionSource.getTask();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4923i)) {
            return false;
        }
        C4923i c4923i = (C4923i) obj;
        return this.f18673a.equals(c4923i.f18673a) && this.f18674b.equals(c4923i.f18674b);
    }

    public int hashCode() {
        return (this.f18673a.hashCode() * 31) + this.f18674b.hashCode();
    }

    /* JADX INFO: renamed from: j */
    public Task m22163j() {
        return m22164k(EnumC4939y.DEFAULT);
    }

    /* JADX INFO: renamed from: k */
    public Task m22164k(EnumC4939y enumC4939y) {
        return enumC4939y == EnumC4939y.CACHE ? ((Task) this.f18674b.m22146b(new InterfaceC2047o() { // from class: com.google.firebase.firestore.c
            @Override // p186Y4.InterfaceC2047o
            public final Object apply(Object obj) {
                return ((C1379z) obj).m5939i(this.f18659a.f18673a);
            }
        })).continueWith(AbstractC2044l.f6763b, new Continuation() { // from class: com.google.firebase.firestore.d
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C4923i.m22154b(this.f18660a, task);
            }
        }) : m22162l(enumC4939y);
    }
}
