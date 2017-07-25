/*******************************************************************************
 * Copyright 2009, Clark N. Hobbie
 * 
 * This file is part of the CLIPC library.
 * 
 * The CLIPC library is free software; you can redistribute it and/or modify it
 * under the terms of the Lesser GNU General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or (at
 * your option) any later version.
 * 
 * The CLIPC library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the Lesser GNU General Public
 * License for more details.
 * 
 * You should have received a copy of the Lesser GNU General Public License
 * along with the CLIP library; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 * 
 *******************************************************************************/
/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_lts_ipc_semaphore_SemaphoreNative */

#ifndef _Included_com_lts_ipc_semaphore_SemaphoreNative
#define _Included_com_lts_ipc_semaphore_SemaphoreNative
#ifdef __cplusplus
extern "C" {
#endif
#undef com_lts_ipc_semaphore_SemaphoreNative_RESULT_SUCCESS
#define com_lts_ipc_semaphore_SemaphoreNative_RESULT_SUCCESS 0L
#undef com_lts_ipc_semaphore_SemaphoreNative_RESULT_UNKNOWN_ERROR
#define com_lts_ipc_semaphore_SemaphoreNative_RESULT_UNKNOWN_ERROR 1L
#undef com_lts_ipc_semaphore_SemaphoreNative_RESULT_PLATFORM_ERROR
#define com_lts_ipc_semaphore_SemaphoreNative_RESULT_PLATFORM_ERROR 2L
#undef com_lts_ipc_semaphore_SemaphoreNative_RESULT_UNKNOWN_HANDLE
#define com_lts_ipc_semaphore_SemaphoreNative_RESULT_UNKNOWN_HANDLE 3L
#undef com_lts_ipc_semaphore_SemaphoreNative_RESULT_TIMEOUT
#define com_lts_ipc_semaphore_SemaphoreNative_RESULT_TIMEOUT 4L
#undef com_lts_ipc_semaphore_SemaphoreNative_RESULT_ACCESS_DENIED
#define com_lts_ipc_semaphore_SemaphoreNative_RESULT_ACCESS_DENIED 5L
#undef com_lts_ipc_semaphore_SemaphoreNative_RESULT_NOT_IMPLEMENTED
#define com_lts_ipc_semaphore_SemaphoreNative_RESULT_NOT_IMPLEMENTED 6L
#undef com_lts_ipc_semaphore_SemaphoreNative_RESULT_TOO_MANY_INCREMENTS
#define com_lts_ipc_semaphore_SemaphoreNative_RESULT_TOO_MANY_INCREMENTS 7L
/*
 * Class:     com_lts_ipc_semaphore_SemaphoreNative
 * Method:    connect
 * Signature: (Lcom/lts/ipc/semaphore/SemaphoreResult;Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_com_lts_ipc_semaphore_SemaphoreNative_connect
  (JNIEnv *, jclass, jobject, jstring, jint);

/*
 * Class:     com_lts_ipc_semaphore_SemaphoreNative
 * Method:    increment
 * Signature: (Lcom/lts/ipc/semaphore/SemaphoreResult;J)V
 */
JNIEXPORT void JNICALL Java_com_lts_ipc_semaphore_SemaphoreNative_increment
  (JNIEnv *, jclass, jobject, jlong);

/*
 * Class:     com_lts_ipc_semaphore_SemaphoreNative
 * Method:    decrement
 * Signature: (Lcom/lts/ipc/semaphore/SemaphoreResult;JJ)V
 */
JNIEXPORT void JNICALL Java_com_lts_ipc_semaphore_SemaphoreNative_decrement
  (JNIEnv *, jclass, jobject, jlong, jlong);

/*
 * Class:     com_lts_ipc_semaphore_SemaphoreNative
 * Method:    getValue
 * Signature: (Lcom/lts/ipc/semaphore/SemaphoreResult;J)I
 */
JNIEXPORT jint JNICALL Java_com_lts_ipc_semaphore_SemaphoreNative_getValue
  (JNIEnv *, jclass, jobject, jlong);

/*
 * Class:     com_lts_ipc_semaphore_SemaphoreNative
 * Method:    supportsGetValue
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_com_lts_ipc_semaphore_SemaphoreNative_supportsGetValue
  (JNIEnv *, jclass);

/*
 * Class:     com_lts_ipc_semaphore_SemaphoreNative
 * Method:    setValue
 * Signature: (Lcom/lts/ipc/semaphore/SemaphoreResult;JI)I
 */
JNIEXPORT jint JNICALL Java_com_lts_ipc_semaphore_SemaphoreNative_setValue
  (JNIEnv *, jclass, jobject, jlong, jint);

/*
 * Class:     com_lts_ipc_semaphore_SemaphoreNative
 * Method:    supportsSetValue
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_com_lts_ipc_semaphore_SemaphoreNative_supportsSetValue
  (JNIEnv *, jclass);

/*
 * Class:     com_lts_ipc_semaphore_SemaphoreNative
 * Method:    createResult
 * Signature: (Lcom/lts/ipc/semaphore/SemaphoreResult;Ljava/lang/String;II)V
 */
JNIEXPORT void JNICALL Java_com_lts_ipc_semaphore_SemaphoreNative_createResult
  (JNIEnv *, jclass, jobject, jstring, jint, jint);

/*
 * Class:     com_lts_ipc_semaphore_SemaphoreNative
 * Method:    linkTest
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_lts_ipc_semaphore_SemaphoreNative_linkTest
  (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif
