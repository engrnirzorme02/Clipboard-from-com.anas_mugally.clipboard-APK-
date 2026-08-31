package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes2.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    public NativeOnCompleteListener(long j7) {
        this.zza = j7;
    }

    public static void createAndAddCallback(Task<Object> task, long j7) {
        task.addOnCompleteListener(new NativeOnCompleteListener(j7));
    }

    public native void nativeOnComplete(long j7, Object obj, boolean z7, boolean z8, String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<Object> task) {
        Object result;
        String message;
        Exception exception;
        if (task.isSuccessful()) {
            result = task.getResult();
            message = null;
        } else if (task.isCanceled() || (exception = task.getException()) == null) {
            result = null;
            message = null;
        } else {
            message = exception.getMessage();
            result = null;
        }
        nativeOnComplete(this.zza, result, task.isSuccessful(), task.isCanceled(), message);
    }
}
