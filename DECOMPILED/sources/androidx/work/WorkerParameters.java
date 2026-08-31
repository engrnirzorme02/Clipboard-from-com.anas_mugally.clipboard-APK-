package androidx.work;

import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p112O0.AbstractC1109v;
import p112O0.InterfaceC1093f;
import p112O0.InterfaceC1102o;
import p182Y0.InterfaceC2010a;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a */
    private UUID f11846a;

    /* JADX INFO: renamed from: b */
    private C2896b f11847b;

    /* JADX INFO: renamed from: c */
    private Set f11848c;

    /* JADX INFO: renamed from: d */
    private C2894a f11849d;

    /* JADX INFO: renamed from: e */
    private int f11850e;

    /* JADX INFO: renamed from: f */
    private Executor f11851f;

    /* JADX INFO: renamed from: g */
    private InterfaceC2010a f11852g;

    /* JADX INFO: renamed from: h */
    private AbstractC1109v f11853h;

    /* JADX INFO: renamed from: i */
    private InterfaceC1102o f11854i;

    /* JADX INFO: renamed from: j */
    private InterfaceC1093f f11855j;

    /* JADX INFO: renamed from: androidx.work.WorkerParameters$a */
    public static class C2894a {

        /* JADX INFO: renamed from: a */
        public List f11856a;

        /* JADX INFO: renamed from: b */
        public List f11857b;

        /* JADX INFO: renamed from: c */
        public Network f11858c;

        public C2894a() {
            List list = Collections.EMPTY_LIST;
            this.f11856a = list;
            this.f11857b = list;
        }
    }

    public WorkerParameters(UUID uuid, C2896b c2896b, Collection collection, C2894a c2894a, int i7, Executor executor, InterfaceC2010a interfaceC2010a, AbstractC1109v abstractC1109v, InterfaceC1102o interfaceC1102o, InterfaceC1093f interfaceC1093f) {
        this.f11846a = uuid;
        this.f11847b = c2896b;
        this.f11848c = new HashSet(collection);
        this.f11849d = c2894a;
        this.f11850e = i7;
        this.f11851f = executor;
        this.f11852g = interfaceC2010a;
        this.f11853h = abstractC1109v;
        this.f11854i = interfaceC1102o;
        this.f11855j = interfaceC1093f;
    }

    /* JADX INFO: renamed from: a */
    public Executor m14468a() {
        return this.f11851f;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC1093f m14469b() {
        return this.f11855j;
    }

    /* JADX INFO: renamed from: c */
    public UUID m14470c() {
        return this.f11846a;
    }

    /* JADX INFO: renamed from: d */
    public C2896b m14471d() {
        return this.f11847b;
    }

    /* JADX INFO: renamed from: e */
    public Network m14472e() {
        return this.f11849d.f11858c;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC1102o m14473f() {
        return this.f11854i;
    }

    /* JADX INFO: renamed from: g */
    public int m14474g() {
        return this.f11850e;
    }

    /* JADX INFO: renamed from: h */
    public Set m14475h() {
        return this.f11848c;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC2010a m14476i() {
        return this.f11852g;
    }

    /* JADX INFO: renamed from: j */
    public List m14477j() {
        return this.f11849d.f11856a;
    }

    /* JADX INFO: renamed from: k */
    public List m14478k() {
        return this.f11849d.f11857b;
    }

    /* JADX INFO: renamed from: l */
    public AbstractC1109v m14479l() {
        return this.f11853h;
    }
}
