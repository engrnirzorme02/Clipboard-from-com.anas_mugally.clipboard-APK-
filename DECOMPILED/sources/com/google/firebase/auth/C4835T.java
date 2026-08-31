package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import java.util.Objects;
import p192Z3.AbstractC2093G;
import p192Z3.InterfaceC2108W;
import p192Z3.InterfaceC2111Z;

/* JADX INFO: renamed from: com.google.firebase.auth.T */
/* JADX INFO: loaded from: classes.dex */
final class C4835T extends AbstractC2093G {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ boolean f18488a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ AbstractC4880u f18489b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ C4856h f18490c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ FirebaseAuth f18491d;

    C4835T(FirebaseAuth firebaseAuth, boolean z7, AbstractC4880u abstractC4880u, C4856h c4856h) {
        this.f18488a = z7;
        this.f18489b = abstractC4880u;
        this.f18490c = c4856h;
        Objects.requireNonNull(firebaseAuth);
        this.f18491d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [Z3.W, com.google.firebase.auth.FirebaseAuth$b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p192Z3.AbstractC2093G
    /* JADX INFO: renamed from: d */
    public final Task mo8637d(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        if (this.f18488a) {
            FirebaseAuth firebaseAuth = this.f18491d;
            return firebaseAuth.f18443e.zzb(firebaseAuth.f18439a, (AbstractC4880u) AbstractC3718s.m18083l(this.f18489b), this.f18490c, str, (InterfaceC2108W) new FirebaseAuth.C4822b(this.f18491d));
        }
        FirebaseAuth firebaseAuth2 = this.f18491d;
        return firebaseAuth2.f18443e.zza(firebaseAuth2.f18439a, this.f18490c, str, (InterfaceC2111Z) new FirebaseAuth.C4821a(this.f18491d));
    }
}
