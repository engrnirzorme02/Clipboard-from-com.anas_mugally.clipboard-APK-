package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Objects;
import p192Z3.AbstractC2093G;
import p192Z3.InterfaceC2108W;

/* JADX INFO: renamed from: com.google.firebase.auth.m0 */
/* JADX INFO: loaded from: classes.dex */
final class C4867m0 extends AbstractC2093G {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ AbstractC4880u f18540a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ C4856h f18541b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ FirebaseAuth f18542c;

    C4867m0(FirebaseAuth firebaseAuth, AbstractC4880u abstractC4880u, C4856h c4856h) {
        this.f18540a = abstractC4880u;
        this.f18541b = c4856h;
        Objects.requireNonNull(firebaseAuth);
        this.f18542c = firebaseAuth;
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
            Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        }
        FirebaseAuth firebaseAuth = this.f18542c;
        return firebaseAuth.f18443e.zza(firebaseAuth.f18439a, this.f18540a, (AbstractC4854g) this.f18541b, str, (InterfaceC2108W) new FirebaseAuth.C4822b(this.f18542c));
    }
}
