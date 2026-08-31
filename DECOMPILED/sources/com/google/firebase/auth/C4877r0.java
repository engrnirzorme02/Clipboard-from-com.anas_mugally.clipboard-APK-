package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import java.util.Objects;
import p192Z3.AbstractC2093G;

/* JADX INFO: renamed from: com.google.firebase.auth.r0 */
/* JADX INFO: loaded from: classes.dex */
final class C4877r0 extends AbstractC2093G {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ String f18552a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ boolean f18553b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ AbstractC4880u f18554c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ String f18555d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ String f18556e;

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ FirebaseAuth f18557f;

    C4877r0(FirebaseAuth firebaseAuth, String str, boolean z7, AbstractC4880u abstractC4880u, String str2, String str3) {
        this.f18552a = str;
        this.f18553b = z7;
        this.f18554c = abstractC4880u;
        this.f18555d = str2;
        this.f18556e = str3;
        Objects.requireNonNull(firebaseAuth);
        this.f18557f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [Z3.W, com.google.firebase.auth.FirebaseAuth$b] */
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
            Log.i("FirebaseAuth", "Logging in as " + this.f18552a + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + this.f18552a);
        }
        if (this.f18553b) {
            FirebaseAuth firebaseAuth = this.f18557f;
            return firebaseAuth.f18443e.zzb(firebaseAuth.f18439a, (AbstractC4880u) AbstractC3718s.m18083l(this.f18554c), this.f18552a, this.f18555d, this.f18556e, str, new FirebaseAuth.C4822b(this.f18557f));
        }
        FirebaseAuth firebaseAuth2 = this.f18557f;
        return firebaseAuth2.f18443e.zzb(firebaseAuth2.f18439a, this.f18552a, this.f18555d, this.f18556e, str, new FirebaseAuth.C4821a(this.f18557f));
    }
}
